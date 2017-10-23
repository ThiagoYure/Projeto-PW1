<%-- 
    Document   : perfilUsuario
    Created on : 18/10/2017, 23:22:34
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
                    <div class="row center">
                        <a href="pesquisaLocal.jsp" class="waves-effect waves-light btn light-blue">Locais</a> 
                        <a href="pesquisaEvento.jsp" class="waves-effect waves-light btn light-blue">Eventos</a>
                        <a href="pesquisaUsuario.jsp" class="waves-effect waves-light btn light-blue">Usuários</a>
                    </div>
                </div>
                </br>
                <MyTags:buscaUsuarioE email='${param.email}'/>
                <div class="center-align">
                    <h3>Perfil de Usuario</h3>
                </div>
                <div class="container"><div class="divider"></div></div>
                </br>
                <div class="container">
                    <div>
                        <div class="row">
                            <div class="col s4"><img class="responsive-img circle" style="width: 200px;height: 170px" src="${Usuario.fotoPerfil}"></div> 
                            <div class="col s8">
                                <div class="col s6"><p><i class="small material-icons">email</i> :<u> ${Usuario.email}</u></p><p><i class="small material-icons">account_circle</i> :<u> ${Usuario.nome}</u></p></div>
                                <div class="col s6"><p><i class="small material-icons">wc</i> :<u> ${Usuario.sexo}</u></p><p><i class="small material-icons">public</i> :<u> ${Usuario.cidade}</u></p></div>
                            </div>
                        </div>
                        <div><a class="btn" href="FrontController?controller=EnviarSolicitacao&usuario=${param.email}">Enviar Solicitação</a></div>
                        <div><a class="btn modal-trigger" href="#modal1">Enviar Mensagem</a></div>
                        <div id="modal1" class="modal">
                            <div class="modal-content black-text">
                                <h4>Envie uma mensagem</h4>
                                <form method="POST" action="FrontController?controller=EnviarMensagem&usuario=${param.email}">
                                    <div class="input-field">
                                        <textarea id="msg" name="msg" class="black-text materialize-textarea"></textarea>
                                        <label class="black-text" for="msg">Mensagem</label>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="submit">Enviar</button>
                                    </div>
                                </form>
                            </div>

                        </div>
                    </div>
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