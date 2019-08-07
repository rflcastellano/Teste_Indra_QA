package steps;

import cucumber.api.java.pt.Quando;

import pages.conta_page;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class TesteProva_steps {

	WebDriver driver = config.env.CreateWebDriver("chrome");

	conta_page conta = new conta_page(driver);

	conta_page contaPage = new conta_page(driver);

	@Dado("^que foi acessado o site \"([^\"]*)\"$")
	public void que_foi_acessado_o_site(String arg1) throws Exception {
		conta.acessarUrlLogin(arg1);
	}

	@Quando("^inserir na pesquisa \"([^\"]*)\"$")
	public void inserir_na_pesquisa(String arg1) throws Exception {
		conta.inserirPesquisa(arg1);
	}

	@E("^clicar em Pesquisar$")
	public void clicar_em_Pesquisar() throws Exception {
		conta.clicarPesquisar();

	}

	@Entao("^valido o resultado da pesquisa do diretor$")
	public void valido_o_resultado_da_pesquisa_do_diretor() throws Exception {
		conta.validarResultado();
	}

	@Entao("^fecho o navegador$")
	public void fecho_o_navegador() throws Exception {
		conta.fecharNavegador();
	}

}
