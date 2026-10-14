package pacote;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class DesktopEnvioThread implements Runnable {
    private volatile boolean paradaManual;
    private Socket cliente;
    private final ServerSocket Emissor;

    public DesktopEnvioThread() throws IOException {
        Emissor = new ServerSocket();
        try {
            Emissor.setReuseAddress(true);
            Emissor.bind(new InetSocketAddress(Util.PortaEnvioDesktop));
        } catch (IOException erro) {
            Emissor.close();
            throw erro;
        }
    }

    @Override
    public void run() {
        try {
            while (!paradaManual) {
                try (Socket conexao = Emissor.accept()) {
                    synchronized (this) {
                        if (paradaManual) {
                            return;
                        }
                        cliente = conexao;
                    }
                    // Lê o histórico depois da conexão para entregar os dados mais recentes.
                    String msg = Files.readString(Path.of(Util.PathRepDesktop), StandardCharsets.UTF_8);
                    try (ObjectOutputStream output = new ObjectOutputStream(conexao.getOutputStream())) {
                        output.writeUTF(msg);
                        output.flush();
                    }
                } catch (IOException erro) {
                    if (!paradaManual) {
                        if (Emissor.isClosed()) {
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
                        .log(java.util.logging.Level.WARNING, "Erro ao fechar envio", erro);
            }
        }
    }

    public synchronized void fecharServidor() throws IOException {
        paradaManual = true;
        try {
            Emissor.close();
        } finally {
            if (cliente != null) {
                cliente.close();
            }
        }
    }

    private void mostrarErro(IOException erro) {
        SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(null,
                "Erro no envio desktop: " + erro.getMessage()));
    }
}
