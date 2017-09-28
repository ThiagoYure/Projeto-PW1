<%-- 
    Document   : menu
    Created on : 26/09/2017, 10:28:38
    Author     : ThigoYure
--%>
<div class="col s3 light-blue accent-2  white-text" style="min-height: 100%;height: auto;position: fixed">
    <div class="center"><h3>Tatooine</h3></div>
    <div class="row">
        <div class="light-blue card" style="border-radius: 10px">
            <img class="responsive-img col s4" style="margin-top: 10px;margin-bottom: 10px" src="${user.fotoPerfil}" style="margin-top: 10px;margin-bottom: 10px">
            <div class="row">
                <hr style="color: #ffd600;opacity: 0">
                <div class=""><p style="font-size: 15px">Email: </br>${user.email}</p></div> 
                <div class=""><p style="font-size: 15px">Nome: </br>${user.nome}</p></div>
            </div>
        </div>
    </div>
    <div class="divider"></div>
    <div class="row">
        <div class="col s12 center">
            <div class="center"><h4>Menu</h4></div>
        </div>
        <div class="container">
            <div class="row">
                <a href="inicial.jsp" class="waves-effect waves-light btn light-blue col s12">Home</a>
            </div>
            <div class="row">
                <a href="configuracao.jsp" class="waves-effect waves-light btn light-blue col s12">Configurações da Conta</a>
            </div>
            <div class="row">
                <a href="meusLocais.jsp" class="waves-effect waves-light btn light-blue col s12">Meus Locais</a>
            </div>
            <div class="row">
                <a href="meusEventos.jsp" class="waves-effect waves-light btn light-blue col s12">Meus Eventos</a>
            </div>
            <div class="row">
                <a href="frontController?controller=sair" class="waves-effect waves-light btn light-blue col s12">Sair</a>
            </div>
        </div>
    </div>
    <div class="row">
        <div><p class="white-text center">&copy; 2017 Thiago Yure<p></div>
    </div>
</div>
