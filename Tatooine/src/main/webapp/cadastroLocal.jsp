<%-- 
    Document   : cadastroLocal
    Created on : 27/09/2017, 01:34:50
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
            <div class="col s9 offset-s3 light-blue white-text" style="min-height: 100%;height: auto;position: relative; background-repeat: repeat">
                </br>
                <div class="container">
                    <div class="container">
                        <h4 class="center-align" style="font-family: fantasy">Cadastro de Local</h4>
                        <div class="divider">

                        </div>
                        <div class="row">
                            <form method="POST" action="frontController?controller=cadastroLocal" class="col s12" enctype="multipart/form-data">
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input id="nome" name="nome" type="text" class="validate">
                                        <label class="white-text" for="nome">Nome do local</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <textarea name="descricao" id="descricao" class="materialize-textarea"></textarea>
                                        <label class="white-text" for="descricao">Descrição do local</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input id="tipo" name="tipo" type="text" class="validate">
                                        <label class="white-text" for="tipo">Tipo</label>
                                    </div>
                                </div>
                                <div>
                                    <div class="file-field input-field col s12">
                                        <div class="btn">
                                            <span>File</span>
                                            <input name="fotos" type="file" multiple>
                                        </div>
                                        <div class="file-path-wrapper">
                                            <input class="file-path validate" type="text" placeholder="Upload one or more files">
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s4">
                                        <input id="estado" name="estado" type="text" class="validate">
                                        <label class="white-text" for="estado">Estado</label>
                                    </div>
                                    <div class="input-field col s4">
                                        <input id="cidade" name="cidade" type="text" class="validate">
                                        <label class="white-text" for="cidade">Cidade</label>
                                    </div>
                                    <div class="input-field col s4">
                                        <input id="rua" name="rua" type="text" class="validate">
                                        <label class="white-text" for="rua">Rua</label>
                                    </div>
                                </div>
                                <div class="row right">
                                   <input class="light-blue waves-effect waves-light btn" type="submit" value="Salvar"> 
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
