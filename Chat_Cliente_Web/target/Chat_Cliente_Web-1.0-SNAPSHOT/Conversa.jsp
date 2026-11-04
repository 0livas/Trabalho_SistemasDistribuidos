<%-- 
    Document   : Conversa
    Created on : 15 de out. de 2026, 09:23:23
    Author     : Jader
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.io.ObjectOutputStream"%>
<%@page import="java.net.Socket"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <%-- //ScriptLet
        out.print("<BR>Nickname Sessão: </BR>" + session.getAttribute("Nickname") +
                "<BR>Cor Sessão: " + session.getAttribute("Cor") +
                "<BR>Avatar Sessão: </BR>" + session.getAttribute("Avatar"));
        --%>
        <% if(request.getParameter("btnEnviar")!=null){
            String msg = "";
            msg += "<img src=\" Imgs/"+session.getAttribute("Avatar")+"\" width=\"16\" height=\"16\">";
            msg += "<font size=\"+1\" color=\""+ session.getAttribute("Cor") + "\"><B> " + session.getAttribute("Nickname") + "<B></font>";
            if(request.getParameter("cbTom").equals("Diz")){
                msg += " Diz: " + request.getParameter("txtMsg");
                if(!request.getParameter("cbEmoji").equals("")){
                    msg += "<img src=\"" + request.getParameter("cbEmoji") +"\" width=\"30\" height=\"30\"";
                }
                msg += "<BR>";
            }
            else if(request.getParameter("cbTom").equals("Grita")){
                msg += " Grita: " + request.getParameter("txtMsg");
                if(!request.getParameter("cbEmoji").equals("")){
                    msg += "<img src=\"" + request.getParameter("cbEmoji") +"\" width=\"30\" height=\"30\"";
                }
                msg += "<BR>";                
            }
            else if(request.getParameter("cbTom").equals("Xinga")){
                msg += " Xinga: " + request.getParameter("txtMsg");
                if(!request.getParameter("cbEmoji").equals("")){
                    msg += "<img src=\"" + request.getParameter("cbEmoji") +"\" width=\"30\" height=\"30\"";
                }
                msg += "<BR>";
            }
            
            // Conectando no MiddleWare para enviar a msg;
            try{
                Socket cliente = new Socket("127.0.0.1", 6662);
                ObjectOutputStream writer = new ObjectOutputStream(cliente.getOutputStream());
                writer.flush();
                writer.writeUTF(msg);

                writer.close();
                cliente.close();
            } catch(Exception E){
                JOptionPane.showMessageDialog(null, "Erro no Cliente Conversa.jsp::Rotina Principal " + E.getMessage());
                E.printStackTrace();                
            }
        }
        
        %>
        
        <form name="frmConversa" method="post" action="Conversa.jsp"> 
            <label for="txtMsg">Mensagem: </label>
            <input type="text" name="txtMsg" size="200" maxlenght="150">
            <label for="cbEmoji">Emoji: </label>
            <select name="cbEmoji">
                <option value="">Selecione</option>
                <option value="&#128512">Sorriso</option>
                <option value="&#128513">Riso</option>
                <option value="&#128517">Desconforto</option>
                <option value="Imgs/Beijo.png">Beijo</option>
                <option value="Imgs/Coracao.png">Coração</option>
                <option value="Imgs/Dinheiro.png">Dinheiro</option>
            </select>
            <label for="cbTom">Tom: </label>
            <select name="cbTom">
                <option value="Diz">Diz</option>
                <option value="Grita">Grita</option>
                <option value="Xinga">Xinga</option>
            </select>
            <input type="submit" name="btnEnviar" value="Enviar">
        </form>
    </body>
</html>
