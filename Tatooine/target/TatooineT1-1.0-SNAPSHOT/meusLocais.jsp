<%-- 
    Document   : meusLocais
    Created on : 26/09/2017, 23:03:26
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
                </br>
                <div class="center-align">
                    <h3>Meus Locais</h3>
                </div><div class="container"><div class="divider"></div></div>
                </br>
                <div class="container">
                    <div class="card  amber darken-3 center-align">
                        <div class="card-content white-text">
                            <span class="card-title">Local 1!</span>
                            <p>Mussum Ipsum, cacilds vidis litro abertis. Leite de capivaris, leite de mula manquis sem cabeça. 
                                Suco de cevadiss deixa as pessoas mais interessantis. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. 
                                Nec orci ornare consequat. Praesent lacinia ultrices consectetur. Sed non ipsum felis.

                                Quem num gosta di mé, boa gentis num é. Casamentiss faiz malandris se pirulitá. 
                                Detraxit consequat et quo num tendi nada. Paisis, filhis, espiritis santis. </p>
                        </div>
                    </div>
                    <div class="card  amber darken-3 center-align">
                        <div class="card-content white-text">
                            <span class="card-title">Local 2!</span>
                            <p>Mussum Ipsum, cacilds vidis litro abertis. Leite de capivaris, leite de mula manquis sem cabeça. 
                                Suco de cevadiss deixa as pessoas mais interessantis. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. 
                                Nec orci ornare consequat. Praesent lacinia ultrices consectetur. Sed non ipsum felis.

                                Quem num gosta di mé, boa gentis num é. Casamentiss faiz malandris se pirulitá. 
                                Detraxit consequat et quo num tendi nada. Paisis, filhis, espiritis santis. </p>
                        </div>
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
