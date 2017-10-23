<%-- 
    Document   : index
    Created on : 05/09/2017, 22:05:41
    Author     : ThigoYure
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css" media="screen,projection"/>
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>Tatooine - Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body class="amber lighten-3">
        <div class="row">
            <div class="center"><img class="responsive-img" style="width: 450px;height: 400px" src="images/Tatooine.png"/></div> 
        </div>
        <div class="row">
            <div class="card light-blue accent-2 col s4 offset-s4">
                <div class="card-content white-text">
                    <h4 class="center-align" style="font-family: fantasy">Login</h4>
                    <form action="frontController" method="POST">
                        <div class="row">
                            <div class="input-field col s12">
                                <input name="email" id="email" type="email" class="validate">
                                <label class="white-text" for="email">Email</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input name="senha" type="password" class="validate">
                                <label class="white-text" for="senha">Senha</label>
                                <input type="hidden" name="controller" value="Login">
                            </div>
                        </div>
                        <div class="row center-align">
                            <input class="light-blue waves-effect waves-light btn" type="submit" value="Entrar">
                        </div>
                        <div class="row center-align">
                            Novo no Tatooine? Crie sua conta <a href="cadastro.jsp">aqui</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="row">
            <p class="center-align white-text">&copy; 2017 Thiago Yure<p>
        </div>
        <script type="text/javascript">
        </script>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>
