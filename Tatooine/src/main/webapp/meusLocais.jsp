<%-- 
    Document   : meusLocais
    Created on : 26/09/2017, 23:03:26
    Author     : ThigoYure
--%>
<%@taglib prefix="MyTags" uri="/WEB-INF/tlds/MyTags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css" media="screen,projection"/>
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>Tatooine</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body class="light-blue accent-3">
        <div class="row">
            <%@include file="menu.jsp" %>
            <div class="col s9 offset-s3 light-blue accent-3 white-text" style="min-height: 100%;height: auto;position: relative; background-repeat: repeat">
                </br>
                <div class="center-align">
                    <h3>Meus Locais</h3>
                </div><div class="container"><div class="divider"></div></div>
                </br>
                <div class="container">
                    <div>
                        <ul id="resultado" class="collection">
                            <MyTags:buscaMeusLocais user='${user.email}'/>
                            <c:choose>
                                <c:when test='${empty ListaLocais}'>
                                    <h5>Não há locais cadastrados por você ainda.</h5>
                                </c:when>
                                <c:otherwise>
                                    <c:forEach var='locais' items='${ListaLocais}'>
                                        <a href='perfilLocal.jsp?idlocal=${locais.id}'>
                                            <li class='collection-item avatar amber darken-3 white-text'>
                                                <p> <b>Nome:</b>${locais.nome}</br>
                                                    <b>Rua:</b> ${locais.rua}</br>
                                                    <b>Cidade:</b> ${locais.cidade}</br>
                                                    <b>Estado:</b> ${locais.estado}</br>
                                                    <b>Resumo:</b> ${locais.descricao}</br>
                                                    <b>Tipo:</b> ${locais.tipo}
                                                </p>
                                            </li>
                                        </a>
                                        <div class="divider"></div>
                                    </c:forEach>
                                </c:otherwise>
                            </c:choose>
                        </ul>
                    </div>
                    <div class="fixed-action-btn">
                        <a href="cadastroLocal.jsp" class="btn-floating btn-large amber darken-3 modal-trigger">
                            <i class="large material-icons">add</i>
                        </a>
                    </div>
                </div>
            </div>
            <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
            <script type="text/javascript">
                $(document).ready(function () {
                    // the "href" attribute of the modal trigger must specify the modal ID that wants to be triggered
                    $('.modal').modal();
                });
            </script>
            <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>
