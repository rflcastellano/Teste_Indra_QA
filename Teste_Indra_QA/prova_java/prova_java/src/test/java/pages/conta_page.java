package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class conta_page {
	static WebDriver driver;

	public conta_page(WebDriver driver) {
		conta_page.driver = driver;
	}

	private static String inp_pesquisa = "//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input";
	private static String btn_pesquisa = "//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div/center/input[1]";
	private static String inp_tela = "btnK";
	private static String result_result = "resultStats";

	/*
	 * Metodos Criados
	 * 
	 * @autor: Rafael data:06/08/2019
	 */

	public void guardarPrint(String print) throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Rafael\\Documents\\evidencias/" + print));
	}

	/*
	 * Metodo Para Informar URL na pagina
	 * 
	 */

	public void acessarUrlLogin(String url) throws IOException {
		conta_page.driver.get(url);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Rafael\\Documents\\evidencias/Inserir_Url.png"));
	}

	/*
	 * Metodo Para clicar no botão Pesquisar
	 * 
	 */

	public void clicarPesquisar() throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Rafael\\Documents\\evidencias/Clicar_Pesquisa.png"));
		conta_page.driver.findElement(By.xpath(btn_pesquisa)).click();
		// clicarTela();
	}

	public void clicarTela() {
		conta_page.driver.findElement(By.xpath(inp_tela)).click();

	}

	/*
	 * Metodo Para para digitar texto no campo texto pesquisa
	 * 
	 */

	public void inserirPesquisa(String diretor) throws IOException {
		driver.findElement(By.xpath(inp_pesquisa)).sendKeys(diretor);
		System.out.println("Pesquisa do " + diretor + " realizada com sucesso");

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Rafael\\Documents\\evidencias/Inseirir_Pesquisa.png"));

	}

	/*
	 * Metodo Para validar o resultado do teste
	 * 
	 */

	public Boolean validarResultado() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Rafael\\Documents\\evidencias/Reultado_pesquisa.png"));

		if (driver.findElement(By.id(result_result)).getText() != null) {
			System.out.println("Resultado da pesquisa encontrado com sucesso");
			return true;

		} else {
			System.out.println("Resultado da pesquisa não encontrada");
			return false;

		}

	}

	/*
	 * Metodo Para fechar o navegador
	 * 
	 */

	public void fecharNavegador() {

		System.out.println("Navegador fechado");
		driver.close();

	}

}
