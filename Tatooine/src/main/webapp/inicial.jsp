<%-- 
    Document   : inicial
    Created on : 04/09/2017, 10:47:48
    Author     : ThigoYure
--%>

<%@page import="com.mycompany.tatooine.modelo.Usuario"%>
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
    <body class="amber lighten-4">
        <ul id="slide-out" class="side-nav pink darken-3">
            <li><div class="userView">
                    <div class="background blue lighten-2">
                        <img class="responsive-img" src="images/imgBackground.png"/>
                    </div>
                    <img class="circle" id="fotoPerfil" src="${user.fotoPerfil}">
                    <span class="white-text name" id="name">${user.nome}</span>
                    <span class="white-text email" id="email">${user.email}</span>
                </div></li>
            <li><a href="index.jsp" class="waves-effect" id="buttonLogout"><i class="material-icons">power_settings_new</i>Sair</a></li>
        </ul>
        <div class="navbar-fixed">
            <nav>
                <div class="nav-wrapper pink darken-3" id="inicio">
                    <a href="#" data-activates="slide-out" class="button-collapse show-on-large"><i class="material-icons">menu</i></a>
                    <a href="index.html" class="brand-logo center">Tatooine</a>
                </div>
            </nav>
        </div>
        <div class="container">
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
