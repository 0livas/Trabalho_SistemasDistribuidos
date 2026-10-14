package pacote;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Util {
    public static final String MeuIP = obterMeuIP();
    // Por padrão, cliente e servidor estão na mesma máquina.
    // Em outro computador: -Dchat.servidor=IP_OU_NOME_DO_SERVIDOR
    public static final String IPServidor = System.getProperty("chat.servidor", MeuIP);
    public static String Nickname = "";
    public static String Cor = "";
    public static String Avatar = "";
    public static int PortaRecepcaoDesktop = 6662;
    public static int PortaEnvioDesktop = 6661;

    private static String obterMeuIP() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException erro) {
            return InetAddress.getLoopbackAddress().getHostAddress();
        }
    }
}
