package br.gb.sicredi.tests;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.gb.sicredi.core.BaseTest;
import br.gb.sicredi.entities.Customer;
import br.gb.sicredi.pages.BootstrapThemeCadasterPage;
import br.gb.sicredi.pages.BootstrapThemeListPage;
import br.gb.sicredi.pages.Messages;

/**
 * Classe de testes do desafio.
 * 
 * @author Giovanni Docter Brancher
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BootstrapThemeTest extends BaseTest {

	/** Entidade Customer */
	private Customer customer = new Customer();

	/** Page Objects */
	private BootstrapThemeListPage bootstrapThemeListPage = new BootstrapThemeListPage();
	private BootstrapThemeCadasterPage bootstrapThemeCadasterPage = new BootstrapThemeCadasterPage();

	/**
	 * Desafio 1
	 */
	@Test
	public void testAddCustomerSuccessfully() {
		this.preConditions();
		this.bootstrapThemeListPage.addCustomer();
		Assert.assertEquals("Add Customer", this.bootstrapThemeListPage.getPageName());
		this.bootstrapThemeCadasterPage.preencherCampos(this.customer);
		this.bootstrapThemeCadasterPage.save();
		Assert.assertTrue(this.bootstrapThemeCadasterPage.getMessage().contains(Messages.msgCustomerSavedSuccess()));
	}

	/**
	 * Desafio 2
	 */
	@Test
	public void testDeleteCustomerSuccessfully() {
		this.preConditions();
		this.bootstrapThemeListPage.addCustomer();
		Assert.assertEquals("Add Customer", this.bootstrapThemeListPage.getPageName());
		this.bootstrapThemeCadasterPage.preencherCampos(this.customer);
		this.bootstrapThemeCadasterPage.save();
		Assert.assertTrue(this.bootstrapThemeCadasterPage.getMessage().contains(Messages.msgCustomerSavedSuccess()));
		this.bootstrapThemeCadasterPage.goBackToList();
		this.bootstrapThemeListPage.searchName(this.customer.getName());
		this.bootstrapThemeListPage.checkAllListed();
		this.bootstrapThemeListPage.deleteAllChecked();
		Assert.assertEquals(Messages.msgConfirmCustomerForDeletion(), this.bootstrapThemeListPage.getMsgAlert());
		this.bootstrapThemeListPage.confirmDelete();
		Assert.assertEquals(Messages.msgCustomerDeletedSuccess(), this.bootstrapThemeListPage.getMsgSuccessfullyCustomerDeleted());
	}

	/**
	 * Pre-condicao para executar o teste.
	 */
	private void preConditions() {
		Assert.assertEquals("Customers", this.bootstrapThemeListPage.getPageName());
		this.customer.defaultData();
		this.bootstrapThemeListPage.selectVersionTheme(this.customer.getSelectVersion());
		this.bootstrapThemeListPage.searchName(this.customer.getName());

		if (this.bootstrapThemeListPage.hasResults()) {
			this.bootstrapThemeListPage.checkAllListed();
			this.bootstrapThemeListPage.deleteAllChecked();
			Assert.assertTrue(this.bootstrapThemeListPage.getMsgAlert().contains(Messages.msgConfirmCustomersForDeletion()));
			this.bootstrapThemeListPage.confirmDelete();
			Assert.assertEquals(Messages.msgCustomerDeletedSuccess(), this.bootstrapThemeListPage.getMsgSuccessfullyCustomerDeleted());
		}
	}
}
