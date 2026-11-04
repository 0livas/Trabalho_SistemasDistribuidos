/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

import java.awt.CheckboxMenuItem;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jader
 */
public class menuServidor {
    SystemTray Tray;
    TrayIcon Icon;
    PopupMenu Popup;
    Menu MnuAcoes;
    MenuItem MnuPainelControle;
    CheckboxMenuItem MnuItDesktop;
    CheckboxMenuItem MnuItWeb;
    CheckboxMenuItem MnuItTerceiros;
    CheckboxMenuItem MnuItPublicidade;
    
    frmPainelDeControle frmPainelControle;
    
    public menuServidor(){
        try{
            frmPainelControle = new frmPainelDeControle();
            if (!SystemTray.isSupported()){
                System.out.println("Sem suporte ao SystemTray!");
            } else{
                Tray = SystemTray.getSystemTray();
                
                // Declarando as Variáveis do Menu 
                ImageIcon imgIcon = new ImageIcon("C:\\Users\\Jader\\Documents\\NetBeansProjects\\Trabalho_Chat\\Chat_Middleware_Service\\src\\main\\java\\pacote\\Imgs\\Icong.png", "Servidor Chat");
                Icon = new TrayIcon(imgIcon.getImage());
                Icon.setImageAutoSize(true);
                Popup = new PopupMenu();
                MnuPainelControle = new MenuItem("Abrir Painel de Controle");
                
                MnuPainelControle.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    frmPainelControle.setVisible(true);
                    }
                });
                
                MnuAcoes = new Menu("Ações");
                MnuItDesktop = new CheckboxMenuItem("Servidor Desktop");
                MnuItWeb = new CheckboxMenuItem("Servidor Web");
                MnuItTerceiros = new CheckboxMenuItem("Servidor Terceiros");
                MnuItPublicidade = new CheckboxMenuItem("Servidor Publicidade");
                
                // Construindo o Popup
                Popup.add(MnuPainelControle);
                Popup.addSeparator();
                MnuAcoes.add(MnuItDesktop);
                MnuAcoes.add(MnuItWeb);
                MnuAcoes.add(MnuItTerceiros);
                MnuAcoes.addSeparator();
                MnuAcoes.add(MnuItPublicidade);
                Popup.add(MnuAcoes);
                
                // Adicionando ao TrayIcon
                Icon.setPopupMenu(Popup);
                Tray.add(Icon);
                
            }
        } catch(Exception E){
            JOptionPane.showMessageDialog(null, "Erro ao criar menu do servidor de chat: " + E.getMessage());
            E.printStackTrace();
        }
    }
}