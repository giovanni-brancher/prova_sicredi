package br.gb.sicredi.pages;

import static br.gb.sicredi.core.DriverFactory.getDriver;

import br.gb.sicredi.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Page Object definido para a página do tipo lista.
 * 
 * @author Giovanni Docter Brancher
 *
 */
public class BootstrapThemeListPage extends BasePage {

	/** Definição das esperas explícitas. */
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	/** Locator do campo de busca por nome. */
	private final By searchNameField = By.xpath("//input[@placeholder='Search Name']");
	/** Locator do botão de limpar campo de pesquisa por nome. */
	private final By btnClearSearchName = By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[3]/i");
	/** Locator do combo Select version. */
	private By fieldSelectVersion = By.id("switch-version-select");
	/** Locator do botão Delete localizado abaixo da palavra Actions. */
	private By btnDeleteAllChecked = By
			.xpath("//form[@id='gcrud-search-form']/div[2]/table/thead/tr[2]/td[2]/div/a/span");
	/** Locator do botão Delete do modal de confirmação de exclusão. */
	private By btnConfirmDelete = By.xpath("//button[@class=\"btn btn-danger delete-multiple-confirmation-button\"]");
	/** Locator do botão Add Customer. */
	private By btnAddCustomer = By.linkText("Add Customer");
	/** Locator do radio que seleciona todos os registros listados. */
	private By checkAllListed = By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[1]/div/input");
	/** Locator da mensagem exibida após uma busca. */
	private By msgFiltered = By.xpath("//*[@id='gcrud-search-form']/div[3]/div[4]/span[4]");
	/** Locator do número de resultados encontrados. */
	private By msgNumberResultsFound = By.xpath("//form[@id='gcrud-search-form']/div[3]/div[4]/span[3]");
	/** Locator da mensagem de confirmação de exclusão. */
	private By msgAlertDelete = By.cssSelector(".alert-delete-multiple-one");

	/**
	 * Seleciona a versão do tema.
	 * 
	 * @param option Texto visível da opção escolhida.
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
	 * @return Se sim, true, senão false.
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
	 * Clica no botão Add Customer.
	 */
	public void addCustomer() {
		clicarLink(btnAddCustomer);
	}

	/**
	 * Clica no botão Delete localizado abaixo da palavra Actions.
	 */
	public void deleteAllChecked() {
		wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(btnDeleteAllChecked)));
		clicarBotao(btnDeleteAllChecked);
	}

	/**
	 * Clica no botão Delete localizado no modal de confirmação de exclusão.
	 */
	public void confirmDelete() {
		clicarBotao(btnConfirmDelete);
	}

	/**
	 * Obtém a mensagem de confirmação de exclusão.
	 * 
	 * @return A mensagem de confirmação de exclusão.
	 */
	public String getMsgAlert() {
		wait.until(ExpectedConditions.presenceOfElementLocated(msgAlertDelete));
		return obterTexto(msgAlertDelete);
	}

	/**
	 * Obtém a mensagem de exclusão com sucesso.
	 * 
	 * @return A mensagem de exclusão com sucesso.
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
