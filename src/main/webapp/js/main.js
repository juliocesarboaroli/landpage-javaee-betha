var nome = document.getElementById("inputNome");
var email = document.getElementById("inputEmail");
var URL = 'http://localhost:8080/projetoFinal-1.0-SNAPSHOT/api/interessados';

function cadastrarClicked() {
    $.ajax({
        type: 'POST',
        url: 'http://localhost:8080/projetoFinal-1.0-SNAPSHOT/api/interessados',
        data: getData(),
        contentType: "application/json",
        success: successCallback,
        error: errorCallback
    });
}

function errorCallback() {
    alert('Erro ao enviar dados');
}

function getData() {
    return JSON.stringify({
        nome: nome.value,
        email: email.value
    });
}

function successCallback() {
    alert('Obrigado pelo seu contato, entraremos em contato com você logo mais.');
    nome.value = '';
    email.value = '';
    nome.focus();
}