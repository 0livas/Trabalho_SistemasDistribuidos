<%-- 
    Document   : Chat
    Created on : 15 de out. de 2026, 09:22:22
    Author     : Jader
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chat de Conversa</title>
    </head>
    <body>
        <%-- //ScriptLet EXEMPLO
        out.print("<B>Nickname: </B>" + request.getParameter("txtNickname")+
                "<BR><B>Cor: </B>" + request.getParameter("radCor") +
                "<BR><B>Avatar: </B>" + request.getParameter("radAvatar"));
        --%>
        
        <%
        session.setAttribute("Nickname", request.getParameter("txtNickname"));
        session.setAttribute("Cor", request.getParameter("radCor"));
        session.setAttribute("Avatar", request.getParameter("radAvatar"));
        %>
        
        <iframe src="Topo.jsp" width="100%" height="130"></iframe>
        <iframe src="Mensagem.jsp" width="100%" height="400"></iframe>
        <iframe src="Conversa.jsp" width="100%" height="130"></iframe>
    </body>
</html>
