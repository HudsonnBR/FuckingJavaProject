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
                        <td colspan="3"><center>Edita Filme</center></td>
                    </tr>
                    <tr>
                        <td width="10%">Titulo:</td>
                        <td width="50%">
                            <input type="text" name="titulo" id="titulo" 
                                   value="" size="50">
                        </td>
                        <td><div id="msg-titulo"></div></td>
                    </tr>
                    <tr>
                        <td>Lançamento:</td>
                        <td>
                            <input type="text" name="lancamento" id="lancamento" 
                                   value="" size="50">
                        </td>
                        <td><div id="msg-lancamento"></div></td>
                    </tr>
                    <tr>
                        <td width="10%">Dura&ccedil;&atilde;o:</td>
                        <td width="50%">
                            <input type="text" name="duracao" id="duracao" 
                                   value="" size="50">
                        </td>
                        <td><div id="msg-titulo"></div></td>
                    </tr>
                    <tr>
                        <td width="10%">G&ecirc;nero:</td>
                        <td width="50%">
                            <select name="genero" id="genero">
                                <option value="" selected>Selecione...</option>
                                <option value="1">Ação</option>
                                <option value="2">Suspense</option>
                                <option value="3">Ficção Científica</option>
                            </select>
                        </td>
                        <td><div id="msg-genero"></div></td>
                    </tr>
                    <tr>
                        <td width="10%">Produtora:</td>
                        <td width="50%">
                            <select name="produtora" id="produtora"> 
                                <option value="" selected>Selecione...</option>
                                <option value="1">Warner</option>
                                <option value="2">Fox</option>
                                <option value="3">HBO Plus</option>
                            </select>
                        </td>
                        <td><div id="msg-produtora"></div></td>
                    </tr>
                    <tr>
                        <td colspan="5" align="right">
                            <input type="button" id="btn1"
                                   nome="btn1" value="Salvar"
                                   onclick="validaFilme();">
                            <input type="button" id="btn2"
                                   nome="btn2" value="Excluir"
                                   onclick="excluiFilme();">
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