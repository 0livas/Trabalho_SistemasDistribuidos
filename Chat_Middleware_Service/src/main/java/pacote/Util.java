package pacote;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Util {
    public static final String MeuIP = obterMeuIP();
    public static int PortaRecepcaoDesktop = 6662;
    public static int PortaEnvioDesktop = 6661;
    public static String PathRepDesktop = "C://Dados//RepositorioDesktop.txt";
    public static DesktopRecepcaoThread DesktopRecepcaoThread;
    public static DesktopEnvioThread DesktopEnvioThread;

    private static String obterMeuIP() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException erro) {
            return InetAddress.getLoopbackAddress().getHostAddress();
        }
    }

    public static synchronized void iniciarDesktop() throws IOException {
        if (DesktopRecepcaoThread != null || DesktopEnvioThread != null) {
            throw new IOException("O serviço desktop já está ativo.");
        }
        DesktopRecepcaoThread recepcao = new DesktopRecepcaoThread();
        DesktopEnvioThread envio;
        try {
            envio = new DesktopEnvioThread();
        } catch (IOException erro) {
            try {
                recepcao.fecharServidor();
            } catch (IOException erroFechamento) {
                erro.addSuppressed(erroFechamento);
            }
            throw erro;
        }
        DesktopRecepcaoThread = recepcao;
        DesktopEnvioThread = envio;
        Thread.ofVirtual().start(recepcao);
        Thread.ofVirtual().start(envio);
    }

    public static synchronized void pararDesktop() throws IOException {
        // Mesmo que um fechamento falhe, tenta liberar o outro listener.
        IOException falha = null;
        try {
            if (DesktopRecepcaoThread != null) {
                DesktopRecepcaoThread.fecharServidor();
            }
        } catch (IOException erro) {
            falha = erro;
        }
        try {
            if (DesktopEnvioThread != null) {
                DesktopEnvioThread.fecharServidor();
            }
        } catch (IOException erro) {
            if (falha == null) {
                falha = erro;
            } else {
                falha.addSuppressed(erro);
            }
        } finally {
            DesktopRecepcaoThread = null;
            DesktopEnvioThread = null;
        }
        if (falha != null) {
            throw falha;
        }
    }
}
