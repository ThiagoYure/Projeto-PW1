<%-- 
    Document   : pesquisaUsuario
    Created on : 26/09/2017, 23:37:33
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
    <body>
        <div class="row">
            <%@include file="menu.jsp" %>
            <div class="col s9 offset-s3 light-blue accent-3 white-text" style="min-height: 100%;height: auto;position: fixed; background-image: url(images/Tatooine.jpg);background-size: cover">
                <div class="container">
                    </br>
                    <nav class="amber darken-3">
                        <div class="nav-wrapper">
                            <form>
                                <div class="input-field">
                                    <input id="search" type="search" required>
                                    <label class="label-icon" for="search"><i class="material-icons">search</i></label>
                                    <i class="material-icons">close</i>
                                </div>
                            </form>
                        </div>
                    </nav>
                </div>
                </br>
                <div class="center-align">
                    <h3>Resultado da busca!</h3>
                </div><div class="container"><div class="divider"></div></div>
                </br>
                <div class="container">
                    <div class="card  amber darken-3 center-align">
                        <div class="card-content white-text">
                            <span class="card-title">Usuario 1!</span>
                            <p>Mussum Ipsum, cacilds vidis litro abertis. Leite de capivaris, leite de mula manquis sem cabeça. 
                                Suco de cevadiss deixa as pessoas mais interessantis. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. 
                                Nec orci ornare consequat. Praesent lacinia ultrices consectetur. Sed non ipsum felis.

                                Quem num gosta di mé, boa gentis num é. Casamentiss faiz malandris se pirulitá. 
                                Detraxit consequat et quo num tendi nada. Paisis, filhis, espiritis santis. </p>
                        </div>
                    </div>
                    <div class="card  amber darken-3 center-align">
                        <div class="card-content white-text">
                            <span class="card-title">Usuario 2!</span>
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
