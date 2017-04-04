<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="form1" id="form1" action="" method="post">
                <table border="1" width="50%">
                    <tr>
                        <td colspan="3"><center>Edita Ator</center></td>
                    </tr>
                    <tr>
                        <td width="10%">Nome:</td>
                        <td width="50%">
                            <input type="text" name="nome" id="nome" 
                                   value="" size="50">
                        </td>
                        <td><div id="msg-nome"></div></td>
                    </tr>
                    <tr>
                        <td colspan="3" align="right">
                            <input type="button" id="nome"
                                   nome="nome" value="..."
                                   onclick="validaAtor();">
                            <input type="button" id="btn2"
                                   nome="btn2" value="Excluir"
                                   onclick="excluiAtor();">
                        </td>
                    </tr>
                </table>
            <a href="lista-ator.jsp">Listagem</a>
                &nbsp;|&nbsp;
            <a href="index.html">Menu</a>
        </form>
    </body>
</html>

<script src="funcoes.jsp"></script>