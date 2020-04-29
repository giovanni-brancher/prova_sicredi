package br.gb.sicredi.pages;

import static br.gb.sicredi.core.DriverFactory.getDriver;

import br.gb.sicredi.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Page Object definido para a p�gina do tipo lista.
 * 
 * @author Giovanni Docter Brancher
 *
 */
public class BootstrapThemeListPage extends BasePage {

	/** Defini��o das esperas expl�citas. */
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	/** Locator do campo de busca por nome. */
	private final By searchNameField = By.xpath("//input[@placeholder='Search Name']");
	/** Locator do bot�o de limpar campo de pesquisa por nome. */
	private final By btnClearSearchName = By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[3]/i");
	/** Locator do combo Select version. */
	private By fieldSelectVersion = By.id("switch-version-select");
	/** Locator do bot�o Delete localizado abaixo da palavra Actions. */
	private By btnDeleteAllChecked = By
			.xpath("//form[@id='gcrud-search-form']/div[2]/table/thead/tr[2]/td[2]/div/a/span");
	/** Locator do bot�o Delete do modal de confirma��o de exclus�o. */
	private By btnConfirmDelete = By.xpath("//button[@class=\"btn btn-danger delete-multiple-confirmation-button\"]");
	/** Locator do bot�o Add Customer. */
	private By btnAddCustomer = By.linkText("Add Customer");
	/** Locator do radio que seleciona todos os registros listados. */
	private By checkAllListed = By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[1]/div/input");
	/** Locator da mensagem exibida ap�s uma busca. */
	private By msgFiltered = By.xpath("//*[@id='gcrud-search-form']/div[3]/div[4]/span[4]");
	/** Locator do n�mero de resultados encontrados. */
	private By msgNumberResultsFound = By.xpath("//form[@id='gcrud-search-form']/div[3]/div[4]/span[3]");
	/** Locator da mensagem de confirma��o de exclus�o. */
	private By msgAlertDelete = By.cssSelector(".alert-delete-multiple-one");

	/**
	 * Seleciona a vers�o do tema.
	 * 
	 * @param option Texto vis�vel da op��o escolhida.
	 */
	public void selectVersionTheme(String option) {
		selecionarCombo(fieldSelectVersion, option);
	}

	/**
	 * Busca clientes pelo nome.
	 * 
	 * @param name Nome do cliente
	 */
	public void searchName(String name) {
		clearSearchName();
		wait.until(ExpectedConditions.elementToBeClickable((getDriver().findElement(searchNameField))));
		escrever(searchNameField, name);
		aguardarLoading();
		wait.until(ExpectedConditions.visibilityOf((getDriver().findElement(msgFiltered))));
	}

	/**
	 * Testa se existem resultados listados.
	 * 
	 * @return Se sim, true, sen�o false.
	 */
	public Boolean hasResults() {
		String numberResultsFound = getDriver().findElement(msgNumberResultsFound).getText();
		if ("0".equals(numberResultsFound)) {
			return false;
		}
		return true;
	}

	/**
	 * Seleciona todos os clientes listados.
	 */
	public void checkAllListed() {
		clicarRadio(checkAllListed);
	}

	/**
	 * Clica no bot�o Add Customer.
	 */
	public void addCustomer() {
		clicarLink(btnAddCustomer);
	}

	/**
	 * Clica no bot�o Delete localizado abaixo da palavra Actions.
	 */
	public void deleteAllChecked() {
		wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(btnDeleteAllChecked)));
		clicarBotao(btnDeleteAllChecked);
	}

	/**
	 * Clica no bot�o Delete localizado no modal de confirma��o de exclus�o.
	 */
	public void confirmDelete() {
		clicarBotao(btnConfirmDelete);
	}

	/**
	 * Obt�m a mensagem de confirma��o de exclus�o.
	 * 
	 * @return A mensagem de confirma��o de exclus�o.
	 */
	public String getMsgAlert() {
		wait.until(ExpectedConditions.presenceOfElementLocated(msgAlertDelete));
		return obterTexto(msgAlertDelete);
	}

	/**
	 * Obt�m a mensagem de exclus�o com sucesso.
	 * 
	 * @return A mensagem de exclus�o com sucesso.
	 */
	public String getMsgSuccessfullyCustomerDeleted() {
		try {
			String cmd = "return document.querySelector(\"body > div.alert.alert-success.growl-animated.animated.bounceInDown > span:nth-child(4) > p\").innerText";
			Thread.sleep(750);
			return (String) executarJS(cmd, 0);
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	/**
	 * Aguarda a mensagem Loading desaparecer.
	 */
	private void aguardarLoading() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//div[@class='container-fluid gc-container loading-opacity']")));
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//div[@class='container-fluid gc-container']")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Limpa o campo de pesquisa por nome.
	 */
	private void clearSearchName() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnClearSearchName));
			clicarBotao(btnClearSearchName);
			aguardarLoading();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
