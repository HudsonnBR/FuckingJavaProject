function validaAtor(){
    var nome = document.getElementById('nome').value;
    var msg = 'Preencha este CAMPO!';
    var vazios = 0;
    
    document.getElementById('msg-nome').innerHTML = '';
    
    if(nome == ''){
        vazios++;
        document.getElementById('nome').innerHTML = msg;
    }
    if(vazios > 0)
        return false;
    
    document.form1.action = '/ProjetoFilmes/invoca-ator.do';
    document.form1.submit();
}

function validaFilme(){
    var titulo = document.getElementById('titulo').value;
    var lancamento = document.getElementById('lancamento').value;
    var duracao = document.getElementById('duracao').value;
    var genero = document.getElementById('genero').value;
    var produtora = document.getElementById('produtora').value;
    var msg = 'Preencha este CAMPO!';
    var vazios = 0;
    
    document.getElementById('msg-titulo').innerHTML = '';
    document.getElementById('msg-lancamento').innerHTML = '';
    document.getElementById('msg-duracao').innerHTML = '';
    document.getElementById('msg-genero').innerHTML = '';
    document.getElementById('msg-produtora').innerHTML = '';
    
    if(titulo == ''){
        vazios++;
        document.getElementById('msg-titulo').innerHTML = msg;
    }
    if(lancamento == ''){
        vazios++;
        document.getElementById('msg-lancamento').innerHTML = msg;
    }
    if(duracao == ''){
        vazios++;
        document.getElementById('msg-duracao').innerHTML = msg;
    }
    if(produtora == ''){
        vazios++;
        document.getElementById('msg-produtora').innerHTML = msg;
    }
    
    if(vazios > 0)
        return false;
    
    document.form1.action = '/ProjetoFilmes/invoca-filme.do';
    document.form1.submit(); 
}