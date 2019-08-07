package criacao_locadora;
import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro_usuario {
	
	/*Login do usuario */

	public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("BEM VINDO A LOCADORA ****RALF-LOCADORAS****");
        System.out.println("\n" + "ESTE É O NOSSO CADASTRO DE USUÁRIOS");
        System.out.println("DIGITE SEU LOGIN: ");
        String login = l.nextLine();
        System.out.println("DIGITE SUA SENHA DE ACESSO:");
        String senha = l.nextLine();
        System.out.println("\n" +"USUARIO: "+login + " E SENHA:******" + "  LOGADO COM SUCESSO!!");
        
        /*Inclusão de informações */
        
        System.out.println("\n" +"DIGITE O NOME DO DIRETOR:");
   	    String nome_diretor = l.nextLine();
   	    System.out.println("DIGITE O NASCIMENTO DO DIRETOR:");
  	    String nascimento_diretor = l.nextLine();
  	    System.out.println("DIGITE O NOME DO FILME:");
	    String nome_filme = l.nextLine();
	    System.out.println("DIGITE O ANO DO FILME:");
	    String ano_filme = l.nextLine();
	    System.out.println("\n" +"INFORMAÇÕES GRAVADAS COM SUCESSO!!");
        
	    
	    /*Gravando as informações no array */
  
        Dados usuario;
        usuario = new Dados();
        usuario.setLogin(login);
        ArrayList<Dados> usuarios = new ArrayList<Dados>();
        usuarios.add(usuario);
        
        	
        
     }
	
	
}
