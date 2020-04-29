package br.gb.sicredi.core;

/**
 * Classe com as Propriedades do projeto.
 * 
 * @author Giovanni Docter Brancher
 *
 */
public class Propriedades {

	/**
	 * Browser a ser utilizado nos testes.
	 */
	public static Browsers browser = Browsers.CHROME;

	/**
	 * Browsers disponíveis para os testes.
	 */
	public enum Browsers {
		CHROME, FIREFOX
	}

}
