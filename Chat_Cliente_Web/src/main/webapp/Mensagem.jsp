<%-- 
    Document   : Mensagem
    Created on : 15 de out. de 2026, 09:23:30
    Author     : Jader
--%>

<%@page import="java.io.ObjectInputStream"%>
<%@page import="java.net.Socket"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh" content="5;url=Mensagem.jsp">
    </head>
    
    <body>
        <%
            //try{
                Socket cliente = new Socket("127.0.0.1", 6661);
                ObjectInputStream reader = new ObjectInputStream(cliente.getInputStream());
                String Conversa = reader.readUTF();
                
                reader.close();
                cliente.close();
                out.print(Conversa);
                        
            //} catch(Exception E){
                //JOptionPane.showMessageDialog(null, "");
            //}
        %>
    </body>
</html>
