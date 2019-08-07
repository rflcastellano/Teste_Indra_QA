package criacao_locadora;

/*CLASSE QUE GUARDA AS VARIAVEIS DOS OBJETOS */
public class Dados {
private String login;
private String senha;
private String nome_diretor;
private String nascimento_diretor;
private String nome_filmes;
private String ano_filmes;

public Dados(){
}

/* Informações de cadastro */

public String getLogin(){
return login;
}
public String getSenha(){
return senha;
}
public void setLogin(String log ){
login = log;
}

/* Informações de Diretor/Filme */

public String getNome_diretor(){
return nome_diretor;
}

public String getNascimento_diretor(){
return nascimento_diretor;
}

public String getNome_filmes(){
return nome_filmes;
}

public String getAno_filmes(){
return ano_filmes;
}


}