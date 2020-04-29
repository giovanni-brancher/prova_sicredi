package br.gb.sicredi.core;

import static br.gb.sicredi.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

/**
 * Classe com os m�todos b�sicos para a execu��o dos testes.
 * 
 * @author Giovanni Docter Brancher
 *
 */
public class BasePage {
	/**
	 * Obt�m o t�tulo da p�gina.
	 * 
	 * @return O t�tulo da p�gina.
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
	 * Clica no bot�o.
	 * 
	 * @param by Locator do bot�o.
	 */
	public void clicarBotao(By by) {
		getDriver().findElement(by).click();
	}

	/**
	 * Seleciona uma op��o do combo pelo texto vis�vel.
	 * 
	 * @param locator Locator do combo.
	 * @param opcao   Texto vis�vel da op��o.
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
	 * Obt�m o texto.
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
	 * @return A execu��o do comando em JavaScript.
	 */
	public Object executarJS(String cmd, Object... param) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		return js.executeScript(cmd, param);
	}
}
