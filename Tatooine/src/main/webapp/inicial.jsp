<%-- 
    Document   : inicial
    Created on : 04/09/2017, 10:47:48
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
                    <h3>Eventos Compartilhados com você!</h3>
                </div><div class="container"><div class="divider"></div></div>
                </br>
                <div class="container">
                    <div class="card  amber darken-3 center-align">
                        <div class="card-content white-text">
                            <span class="card-title">Evento 1!</span>
                            <p>Mussum Ipsum, cacilds vidis litro abertis. Leite de capivaris, leite de mula manquis sem cabeça. 
                                Suco de cevadiss deixa as pessoas mais interessantis. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. 
                                Nec orci ornare consequat. Praesent lacinia ultrices consectetur. Sed non ipsum felis.

                                Quem num gosta di mé, boa gentis num é. Casamentiss faiz malandris se pirulitá. 
                                Detraxit consequat et quo num tendi nada. Paisis, filhis, espiritis santis. </p>
                        </div>
                    </div>
                    <div class="card  amber darken-3 center-align">
                        <div class="card-content white-text">
                            <span class="card-title">Evento 2!</span>
                            <p>Mussum Ipsum, cacilds vidis litro abertis. Leite de capivaris, leite de mula manquis sem cabeça. 
                                Suco de cevadiss deixa as pessoas mais interessantis. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. 
                                Nec orci ornare consequat. Praesent lacinia ultrices consectetur. Sed non ipsum felis.

                                Quem num gosta di mé, boa gentis num é. Casamentiss faiz malandris se pirulitá. 
                                Detraxit consequat et quo num tendi nada. Paisis, filhis, espiritis santis. </p>
                        </div>
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
