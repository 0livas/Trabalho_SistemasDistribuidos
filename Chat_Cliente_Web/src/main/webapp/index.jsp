<%-- 
    Document   : index
    Created on : 14 de out. de 2026, 11:30:46
    Author     : Jader
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chat Distribuído WEB 1.0</title>
    </head>
    <body><br><br><br>
    <center>
        <form name="FrmLogin" action="Chat.jsp" method="post">
            <table border="1">
                <tr>
                    <td colspan="2" bgcolor="AntiqueWhite" align="center"><font color="Peru" size="+3"> Chat Distribuído 1.0</font></td>
                </tr>
                <tr>
                    <td align="Right">
                        <B> Nickname: </B>
                    </td>
                    <td>
                        <input type="text" name="txtNickname" maxlength="20" size="100">
                    </td>
                </tr>
                <tr>
                    <td align="Right"> 
                        <B> Cor: </B>
                    </td>
                    <td>
                        <input type="radio" name="radCor" value="Green" checked>
                        <font color="Green"><B> Verde </B> </font>
                        <input type="radio" name="radCor" value="Purple" checked>
                        <font color="Purple"><B> Roxo </B> </font>
                        <input type="radio" name="radCor" value="Pink" checked>
                        <font color="Pink"><B> Rosa </B> </font>
                    </td>  
                </tr>
                <tr>
                    <td align="Right">
                        <B> Avatar: </B>
                    </td>
                    <td>
                        <input type="radio" name="radAvatar" value="MaleIcon.png" checked>
                        <img src="Imgs/MaleIcon.png" width="30" height="30">

                        <input type="radio" name="radAvatar" value="FemaleIcon.png" checked>
                        <img src="Imgs/FemaleIcon.png" width="30" height="30">

                        <input type="radio" name="radAvatar" value="UknownIcon.png" checked>
                        <img src="Imgs/UknownIcon.png" width="30" height="30">
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" name="btnEntrar" value="Entrar">
                    </td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>
