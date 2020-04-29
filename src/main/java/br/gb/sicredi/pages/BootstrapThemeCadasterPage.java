package br.gb.sicredi.pages;

import static br.gb.sicredi.core.DriverFactory.getDriver;

import br.gb.sicredi.core.BasePage;
import br.gb.sicredi.entities.Customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Page Object definido para a página do tipo cadastro.
 * 
 * @author Giovanni Docter Brancher
 *
 */
public class BootstrapThemeCadasterPage extends BasePage {

	/** Locator do campo Name. */
	private By nameField = By.id("field-customerName");
	/** Locator do campo Last Name. */
	private By lastNameField = By.id("field-contactLastName");
	/** Locator do campo ContactFirstName. */
	private By contactFirstNameField = By.id("field-contactFirstName");
	/** Locator do campo Phone. */
	private By phoneField = By.id("field-phone");
	/** Locator do campo AddressLine1. */
	private By addressLine1Field = By.id("field-addressLine1");
	/** Locator do campo AddressLine2. */
	private By addressLine2Field = By.id("field-addressLine2");
	/** Locator do campo City. */
	private By cityField = By.id("field-city");
	/** Locator do campo State. */
	private By stateField = By.id("field-state");
	/** Locator do campo PostalCode. */
	private By postalCodeField = By.id("field-postalCode");
	/** Locator do campo Country. */
	private By countryField = By.id("field-country");
	/** Locator do combo From Employeer. */
	private By fromEmployeerField = By.xpath("//div[@id='field_salesRepEmployeeNumber_chosen']/a/span");
	/** Locator do campo de pesquisa do combo From Employeer. */
	private By innerFromEmployeerField = By.xpath("//div[@id='field_salesRepEmployeeNumber_chosen']/div/div/input");
	/** Locator do campo CreditLimit. */
	private By creditLimitField = By.id("field-creditLimit");
	/** Locator do botão Save. */
	private By btnSave = By.id("form-button-save");
	/** Locator do botão Save and go back to list. */
	private By btnSaveAndGoBackToList = By.id("save-and-go-back-button");
	/** Locator do botão Cancel. */
	private By btnCancel = By.id("cancel-button");
	/** Locator da mensagem de inclusão com sucesso. */
	private By msgSuccess = By.xpath("//*[@id=\"report-success\"]/p");
	/** Locator do link Go back to list. */
	private By linkGoBackToList = By.linkText("Go back to list");

	/**
	 * Atribui o nome do cliente.
	 * 
	 * @param nameField the fieldName to set
	 */
	public void setName(String name) {
		escrever(nameField, name);
	}

	/**
	 * Atribui o último nome do cliente.
	 * 
	 * @param lastNameField the fieldLastName to set
	 */
	public void setLastName(String lastName) {
		escrever(lastNameField, lastName);
	}

	/**
	 * Atribui o primeiro nome do cliente para contato.
	 * 
	 * @param contactFirstNameField the fieldContactFirstName to set
	 */
	public void setContactFirstName(String contactFirstName) {
		escrever(contactFirstNameField, contactFirstName);
	}

	/**
	 * Atribui o telefone do cliente.
	 * 
	 * @param phoneField the fieldPhone to set
	 */
	public void setPhone(String phone) {
		escrever(phoneField, phone);
	}

	/**
	 * Atribui o primeiro endereço do cliente.
	 * 
	 * @param addressLine1Field the fieldAddressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		escrever(addressLine1Field, addressLine1);
	}

	/**
	 * Atribui o segundo endereço do cliente.
	 * 
	 * @param addressLine2Field the fieldAddressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		escrever(addressLine2Field, addressLine2);
	}

	/**
	 * Atribui a cidade do cliente.
	 * 
	 * @param cityField the fieldCity to set
	 */
	public void setCity(String city) {
		escrever(cityField, city);
	}

	/**
	 * Atribui o Estado do cliente.
	 * 
	 * @param stateField the fieldState to set
	 */
	public void setState(String state) {
		escrever(stateField, state);
	}

	/**
	 * Atribui o código postal do cliente.
	 * 
	 * @param postalCodeField the fieldPostalCode to set
	 */
	public void setPostalCode(String postalCode) {
		escrever(postalCodeField, postalCode);
	}

	/**
	 * Atribui o país do cliente.
	 * 
	 * @param countryField the fieldCountry to set
	 */
	public void setCountry(String country) {
		escrever(countryField, country);
	}

	/**
	 * Atribui o empregador do cliente.
	 * 
	 * @param fromEmployeerField the fieldFromEmployeer to set
	 */
	public void setFromEmployeer(String fromEmployeer) {
		WebElement selectFromEmployeer = getDriver().findElement(fromEmployeerField);
		executarJS("window.scrollBy(0, arguments[0])", selectFromEmployeer.getLocation().y);
		clicarBotao(fromEmployeerField);
		escrever(innerFromEmployeerField, fromEmployeer);
		clicarBotao(By.xpath("//em[contains(.,'" + fromEmployeer + "')]"));
	}

	/**
	 * Atribui o limite de crédito do cliente.
	 * 
	 * @param creditLimitField the fieldCreditLimit to set
	 */
	public void setCreditLimit(String creditLimit) {
		escrever(creditLimitField, creditLimit);
	}

	/**
	 * Clica no botão Save.
	 * 
	 * @param creditLimitField the fieldCreditLimit to set
	 */
	public void save() {
		clicarBotao(btnSave);
	}

	/**
	 * Clica no botão Save and go back to list.
	 * 
	 * @param creditLimitField the fieldCreditLimit to set
	 */
	public void saveAndGoBackToList() {
		clicarBotao(btnSaveAndGoBackToList);
	}

	/**
	 * Clica no botão Cancel.
	 * 
	 * @param creditLimitField the fieldCreditLimit to set
	 */
	public void cancel() {
		clicarBotao(btnCancel);
	}

	/**
	 * Clica no link Go back to list.
	 */
	public void goBackToList() {
		clicarLink(linkGoBackToList);
	}

	/**
	 * Obtém a mensagem de sucesso.
	 * 
	 * @return A mensagem de sucesso.
	 */
	public String getMessage() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(msgSuccess));
		return obterTexto(msgSuccess);
	}

	/**
	 * Preenche os campos do formulário de cadastro.
	 */
	public void preencherCampos(Customer customer) {

		if (customer.getName() != null) {
			this.setName(customer.getName());
		}
		
		if (customer.getLastName() != null) {
			this.setLastName(customer.getLastName());
		}

		if (customer.getContactFirstName() != null) {
			this.setContactFirstName(customer.getContactFirstName());
		}

		if (customer.getPhone() != null) {
			this.setPhone(customer.getPhone());
		}

		if (customer.getAddressLine1() != null) {
			this.setAddressLine1(customer.getAddressLine1());
		}

		if (customer.getAddressLine2() != null) {
			this.setAddressLine2(customer.getAddressLine2());
		}

		if (customer.getCity() != null) {
			this.setCity(customer.getCity());
		}

		if (customer.getState() != null) {
			this.setState(customer.getState());
		}

		if (customer.getPostalCode() != null) {
			this.setPostalCode(customer.getPostalCode());
		}

		if (customer.getCountry() != null) {
			this.setCountry(customer.getCountry());
		}

		if (customer.getFromEmployeer() != null) {
			this.setFromEmployeer(customer.getFromEmployeer());
		}

		if (customer.getCreditLimit() != null) {
			this.setCreditLimit(customer.getCreditLimit());
		}
	}

}
