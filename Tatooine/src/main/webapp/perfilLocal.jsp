<%-- 
    Document   : perfilLocal
    Created on : 18/10/2017, 23:22:50
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
                <div class="center-align">
                    <h3>Perfil de Local</h3>
                </div>
                <div class="container"><div class="divider"></div></div>
                </br>
                <MyTags:buscaLocal id='${param.idlocal}'/>
                <div class="container">
                    <div>
                        <p> <b>Nome:</b>${Local.nome}</br>
                            <b>Rua:</b> ${Local.rua}</br>
                            <b>Cidade:</b> ${Local.cidade}</br>
                            <b>Estado:</b> ${Local.estado}</br>
                            <b>Resumo:</b> ${Local.descricao}</br>
                            <b>Tipo:</b> ${Local.tipo}
                        </p>
                        <a href="modal1" class="modal-trigger btn">Recomendar</a>
                        <a href="modal2" class="modal-trigger btn">Avaliar</a>
                    </div>
                    <div id="modal1" class="modal">
                        <div class="modal-content black-text">
                            <h4>Recomendar Local</h4>
                            <form method="POST" action="FrontController?controller=Recomendar&local=${param.id}">
                                <div class="input-field">
                                    <MyTags:buscaAmigos user="${user.email}"/>
                                    <select name="amigo" required>
                                        <c:forEach var="amigos" items="ListaAmigos">
                                            <option value="${amigo.email}">
                                            <img class="responsive-img circle small" src="${amigo.fotoPerfil}">
                                            <p>
                                                Email: ${amigo.email}</br>
                                                Nome: ${amigo.nome}
                                            </p>
                                            </option>
                                        </c:forEach>  
                                    </select>
                                </div>
                                <div class="modal-footer">
                                    <button type="submit">Recomendar</button>
                                </div>
                            </form>
                        </div>

                    </div>
                    <div id="modal2" class="modal">
                        <div class="modal-content black-text">
                            <h4>Recomendar Local</h4>
                            <form method="POST" action="FrontController?controller=AvaliarLocal&local=${param.id}">
                                <div class="input-field">
                                    <select name="nota" required>
                                        <option value="1">
                                        
                                        </option> 
                                        <option value="2">
                                        
                                        </option>
                                        <option value="3">
                                        
                                        </option>
                                        <option value="4">
                                        
                                        </option>
                                        <option value="5">
                                        
                                        </option>
                                    </select>
                                </div>
                                <div class="modal-footer">
                                    <button type="submit">Avaliar</button>
                                </div>
                            </form>
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