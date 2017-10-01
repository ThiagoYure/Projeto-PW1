<%-- 
    Document   : configuracao
    Created on : 26/09/2017, 14:07:27
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
            <div class="col s9 offset-s3 light-blue white-text" style="min-height: 100%;height: auto;position: absolute; background-image: url(images/Tatooine.jpg);background-size: cover">
                </br>
                <div class="container">
                    <div class="container">
                        <h4 class="center-align" style="font-family: fantasy">Cadastro</h4>
                        <div class="divider">
                            
                        </div>
                        <form action="frontController" method="POST" enctype="multipart/form-data">
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
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input id="nome" name="nome" type="text" class="validate">
                                    <label class="white-text" for="nome">Nome</label>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input id="profissao" name="profissao" type="text" class="validate">
                                    <label class="white-text" for="profissao">Profissão</label>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input id="cidade" name="cidade" type="text" class="validate">
                                    <label class="white-text" for="nome">Cidade</label>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <select name="sexo">
                                        <option value="" disabled selected>Escolha sua opção</option>
                                        <option value="Feminino">Feminino</option>
                                        <option value="Masculino">Masculino</option>
                                    </select>
                                    <label class="white-text">Sexo</label>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input name="nascimento" type="text" class="datepicker" required>
                                    <label class="white-text" for="birthdate">Data de nascimento</label>
                                </div> 
                            </div>
                            <div class="row">
                                <div class="file-field input-field">
                                    <div class="btn light-blue">
                                        <span>Foto de Perfil</span>
                                        <input name="fotoPerfil" type="file" id="arquivo">
                                    </div>
                                    <div class="file-path-wrapper">
                                        <input class="file-path validate" type="text">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12"><input type="hidden" name="controller" value="Cadastro"></div>
                            </div>
                            <div class="row center-align">
                                <input class="light-blue waves-effect waves-light btn" type="submit" value="Salvar">
                                <a class="light-blue waves-effect waves-light btn">Excluir Conta</a></br>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('.datepicker').pickadate({
                    selectMonths: true, // Creates a dropdown to control month
                    selectYears: 15,
                    monthsFull: ['01', '02', '03', '04', '05', '06', '07', '08', '09', '10', '11', '12'],
                    monthsShort: ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'],
                    weekdaysFull: ['Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sabádo'],
                    weekdaysShort: ['Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'Sab'],
                    today: 'Hoje',
                    clear: 'Limpar',
                    close: 'Pronto',
                    labelMonthNext: 'Próximo mês',
                    labelMonthPrev: 'Mês anterior',
                    labelMonthSelect: 'Selecione um mês',
                    labelYearSelect: 'Selecione um ano',
                    format: 'dd/mm/yyyy'
                });
                $('select').material_select();
            });
        </script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>
