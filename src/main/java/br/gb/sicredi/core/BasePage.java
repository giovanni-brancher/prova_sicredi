package br.gb.sicredi.core;

import static br.gb.sicredi.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

/**
 * Classe com os métodos básicos para a execução dos testes.
 * 
 * @author Giovanni Docter Brancher
 *
 */
public class BasePage {
	/**
	 * Obtém o título da página.
	 * 
	 * @return O título da página.
	 */
	public String getPageName() {
		return obterTexto(By.xpath("/html/body/div[2]//*[@class=\"floatL l5\"]"));
	}

	/**
	 * Escreve no campo de texto.
	 * 
	 * @param by    Locator do campo.
	 * @param texto Texto a ser escrito.
	 */
	public void escrever(By by, String texto) {
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	/**
	 * Clica no radio.
	 * 
	 * @param by Locator do radio.
	 */
	public void clicarRadio(By by) {
		getDriver().findElement(by).click();
	}

	/**
	 * Clica no botão.
	 * 
	 * @param by Locator do botão.
	 */
	public void clicarBotao(By by) {
		getDriver().findElement(by).click();
	}

	/**
	 * Seleciona uma opção do combo pelo texto visível.
	 * 
	 * @param locator Locator do combo.
	 * @param opcao   Texto visível da opção.
	 */
	public void selecionarCombo(By locator, String opcao) {
		Select combo = new Select(getDriver().findElement(locator));
		combo.selectByVisibleText(opcao);
	}

	/**
	 * Clica no link.
	 * 
	 * @param link Locator do link.
	 */
	public void clicarLink(By link) {
		getDriver().findElement(link).click();
	}

	/**
	 * Obtém o texto.
	 * 
	 * @param by Locator do texto.
	 * @return O texto.
	 */
	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}

	/**
	 * Executa comandos em JavaScript.
	 * 
	 * @param cmd   Comando a ser executado.
	 * @param param Parametros.
	 * @return A execução do comando em JavaScript.
	 */
	public Object executarJS(String cmd, Object... param) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		return js.executeScript(cmd, param);
	}
}
