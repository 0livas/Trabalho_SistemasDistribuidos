package pacote;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/** Popup de emojis e figurinhas usado pelo campo de mensagem do chat. */
public class Menu_EmojiFigurinha extends JPopupMenu {

    private static final String[] CODIGOS = {
        ":-)", ";-)", "<3", ">:v", "zzz", ";-;", ":-;", "!pin", "x9"
    };
    private static final int[] SIMBOLOS = {
        128513, 128521, 128143, 128555, 128564, 128546, 128517, 128205, 128110
    };

    public Menu_EmojiFigurinha(JTextField campoMensagem, java.util.function.Consumer<String> enviarFigurinha) {
        JTabbedPane abas = new JTabbedPane();
        JPanel emojis = new JPanel(new GridLayout(3, 3, 6, 6));
        emojis.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        for (int i = 0; i < CODIGOS.length; i++) {
            String simbolo = new String(Character.toChars(SIMBOLOS[i]));
            JButton botao = new JButton(simbolo);
            botao.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 26));
            botao.setToolTipText(CODIGOS[i]);
            botao.getAccessibleContext().setAccessibleName("Emoji " + CODIGOS[i]);
            botao.setFocusable(false);
            botao.addActionListener(evento -> {
                campoMensagem.replaceSelection(simbolo);
                setVisible(false);
                campoMensagem.requestFocusInWindow();
            });
            emojis.add(botao);
        }

        JPanel figurinhas = new JPanel(new GridLayout(2, 3, 6, 6));
        figurinhas.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        String[] arquivos = {"NumEh.gif", "QuebraroJarro.gif", "SorreioTriste.gif", "cachorrobobo.gif", "cachorroboboca.gif"};
        for(String arquivo : arquivos){
            java.io.File imagem = new java.io.File(
                    "C:/Users/Jader/Documents/NetBeansProjects/Trabalho_Chat/Chat_Cliente_Desktop/src/main/java/Figurinhas",
                    arquivo);
            String caminho = imagem.toURI().toASCIIString();
            JButton botao = new JButton("<html><img src='" + caminho + "' width='64' height='64'></html>");
            botao.setToolTipText(arquivo);
            botao.setFocusable(false);
            botao.addActionListener(evento -> {
                setVisible(false);
                enviarFigurinha.accept(caminho);
                campoMensagem.requestFocusInWindow();
            });
            figurinhas.add(botao);
        }

        abas.addTab("Emojis", emojis);
        abas.addTab("Figurinhas", figurinhas);
        abas.setPreferredSize(new Dimension(270, 270));
        setLayout(new BorderLayout());
        add(abas, BorderLayout.CENTER);
    }

    public static String converterEmojis(String mensagem) {
        for (int i = 0; i < CODIGOS.length; i++) {
            mensagem = mensagem.replace(CODIGOS[i], "&#" + SIMBOLOS[i] + ";");
        }
        return mensagem;
    }
}
