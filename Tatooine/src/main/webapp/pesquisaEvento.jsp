<%-- 
    Document   : pesquisaEvento
    Created on : 26/09/2017, 23:37:15
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
                <div class="container">
                    </br>
                        <div class="nav-wrapper">
                            <form action="pesquisaEvento.jsp">
                                <div class="input-field">
                                    <input name="nome" id="search" type="search" required>
                                    <label class="label-icon white-text" for="search"><i class="material-icons">search</i></label>
                                </div>
                                <div class="input-field">
                                    <button id="search" class="right btn waves-effect waves-light amber darken-3" type="submit">Pesquisar</button>
                                    </br>
                                </div>
                            </form>
                        </div>
                </div>

                </br>
                <div class="center-align">
                    <h3>Resultado da busca!</h3>
                </div><div class="container"><div class="divider"></div></div>
                </br>
                <div class="container">
                    <div>
                        <ul id="resultado" class="collection">
                            <MyTags:buscaEventos nome='${param.nome}'/>
                            <c:choose>
                                <c:when test='${empty param.nome}'>
                                    <h5>A busca ainda não foi realizada.</h5>
                                </c:when>
                                <c:when test='${empty ListaEventos}'>
                                    <h5>Não há resultados para essa busca.</h5>
                                </c:when>
                                <c:otherwise>
                                    <c:forEach var='eventos' items='${ListaEventos}'>
                                        <a href='perfilEvento.jsp?idevento=${eventos.id}'>
                                            <li class='collection-item avatar amber darken-3 white-text'>
                                                <p> <b>Nome:</b>${eventos.nome}</br>
                                                    <b>Local:</b> ${eventos.local}</br>
                                                    <b>Descrição:</b> ${eventos.descricao}</br>
                                                    <b>Responsável:</b> ${eventos.responsavel}
                                                </p>
                                            </li>
                                        </a>
                                        <div class="divider"></div>
                                    </c:forEach>
                                </c:otherwise>
                            </c:choose>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $(".button-collapse").sideNav();
            });
        </script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>
