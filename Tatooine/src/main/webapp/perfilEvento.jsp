<%-- 
    Document   : perfilEvento
    Created on : 18/10/2017, 23:23:06
    Author     : ThigoYure
--%><%@taglib prefix="MyTags" uri="/WEB-INF/tlds/MyTags" %>
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
                    <div class="row center">
                        <a href="pesquisaLocal.jsp" class="waves-effect waves-light btn light-blue">Locais</a> 
                        <a href="pesquisaEvento.jsp" class="waves-effect waves-light btn light-blue">Eventos</a>
                        <a href="pesquisaUsuario.jsp" class="waves-effect waves-light btn light-blue">Usuários</a>
                    </div>
                </div>
                </br>
                <div class="center-align">
                    <h3>Perfil de Evento</h3>
                </div>
                <div class="container"><div class="divider"></div></div>
                </br>
                <MyTags:buscaEvento id='${param.idevento}'/>
                <div class="container">
                    <div>
                        <p> <b>Nome:</b>${Evento.nome}</br>
                            <b>Local:</b> ${Evento.local}</br>
                            <b>Descrição:</b> ${Evento.descricao}</br>
                            <b>Responsável:</b> ${Evento.responsavel}
                        </p>
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