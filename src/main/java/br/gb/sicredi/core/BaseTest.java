package br.gb.sicredi.core;

import static br.gb.sicredi.core.DriverFactory.getDriver;
import static br.gb.sicredi.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * Classe com os m�todos de inicializa��o e finaliza��o dos testes.
 * 
 * @author Giovanni Docter Brancher
 *
 */
public class BaseTest {

	/**
	 * Nome do teste em execu��o.
	 */
	@Rule
	public TestName testName = new TestName();

	/**
	 * M�todo a ser executado antes de cada execu��o de teste.
	 */
	@Before
	public void inicializa() {
		DriverFactory.getDriver().manage().window().maximize();
		DriverFactory.getDriver().get("https://www.grocerycrud.com/demo/bootstrap_theme");
	}

	/**
	 * M�todo a ser executado depois de cada execu��o de teste.
	 * 
	 * @throws IOException
	 */
	@After
	public void finaliza() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File(
				"target" + File.separator + "screenshot" + File.separator + testName.getMethodName() + ".jpg"));
		killDriver();
	}

}
