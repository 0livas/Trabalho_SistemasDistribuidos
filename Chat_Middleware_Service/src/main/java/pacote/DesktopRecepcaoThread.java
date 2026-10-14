package pacote;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class DesktopRecepcaoThread implements Runnable {
    private volatile boolean paradaManual;
    private Socket cliente;
    private final ServerSocket Receptor;

    // A porta é reservada antes de iniciar a thread, para detectar falhas na ativação.
    public DesktopRecepcaoThread() throws IOException {
        Path repositorio = Path.of(Util.PathRepDesktop);
        if (repositorio.getParent() != null) {
            Files.createDirectories(repositorio.getParent());
        }
        try (var arquivo = Files.newBufferedWriter(repositorio, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            // Garante que o histórico exista mesmo antes da primeira mensagem.
        }
        Receptor = new ServerSocket();
        try {
            Receptor.setReuseAddress(true);
            Receptor.bind(new InetSocketAddress(Util.PortaRecepcaoDesktop));
        } catch (IOException erro) {
            Receptor.close();
            throw erro;
        }
    }

    @Override
    public void run() {
        try {
            while (!paradaManual) {
                try (Socket conexao = Receptor.accept()) {
                    synchronized (this) {
                        if (paradaManual) {
                            return;
                        }
                        cliente = conexao;
                    }
                    conexao.setSoTimeout(5000);
                    try (ObjectInputStream reader = new ObjectInputStream(conexao.getInputStream())) {
                        String msg = reader.readUTF();
                        Files.writeString(Path.of(Util.PathRepDesktop), msg + System.lineSeparator(),
                                StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                    }
                } catch (IOException erro) {
                    if (!paradaManual) {
                        if (Receptor.isClosed()) {
                            throw erro;
                        }
                        mostrarErro(erro);
                    }
                } finally {
                    synchronized (this) {
                        cliente = null;
                    }
                }
            }
        } catch (IOException erro) {
            if (!paradaManual) {
                mostrarErro(erro);
            }
        } finally {
            try {
                fecharServidor();
            } catch (IOException erro) {
                java.util.logging.Logger.getLogger(getClass().getName())
                        .log(java.util.logging.Level.WARNING, "Erro ao fechar recepção", erro);
            }
        }
    }

    public synchronized void fecharServidor() throws IOException {
        paradaManual = true;
        // Fechar o listener desbloqueia accept(); fechar o cliente desbloqueia readUTF().
        try {
            Receptor.close();
        } finally {
            if (cliente != null) {
                cliente.close();
            }
        }
    }

    private void mostrarErro(IOException erro) {
        SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(null,
                "Erro na recepção desktop: " + erro.getMessage()));
    }
}
