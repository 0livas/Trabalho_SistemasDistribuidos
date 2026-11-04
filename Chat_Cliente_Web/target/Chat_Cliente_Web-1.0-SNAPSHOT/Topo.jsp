<%-- 
    Document   : Topo
    Created on : 15 de out. de 2026, 09:23:16
    Author     : Jader
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sala de Conversa</title>
    </head>
    <body>
        <%-- //ScriptLet
        out.print("<BR>Nickname Sessão: </BR>" + session.getAttribute("Nickname") +
                "<BR>Cor Sessão: " + session.getAttribute("Cor") +
                "<BR>Avatar Sessão: </BR>" + session.getAttribute("Avatar"));
        --%>
        
        <!--img src="Imgs/MaleIcon.png" width="50" height="50">-->
        <%
        /*out.print("<img src=\"Imgs/" + session.getAttribute("Avatar")+" \" width=\"50\" height=\"50\">"); */ //Exemplo
        %>
        
        <img src="Imgs/<%=session.getAttribute("Avatar")%>" width="32" height="32"><%=" "%>
        <font size="+2" color="<%=session.getAttribute("Cor")%>">
              <B><%=session.getAttribute("Nickname")%></B>
              </font>
    </body>
</html>
