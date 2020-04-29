package br.gb.sicredi.pages;

/**
 * Classe de mensagens.
 * 
 * @author Giovanni Docter Brancher
 *
 */
public class Messages {

	/**
	 * Mensagem de cadastro com sucesso.
	 * 
	 * @return Mensagem.
	 */
	public static String msgCustomerSavedSuccess() {
		return "Your data has been successfully stored into the database.";
	}

	/**
	 * Mensagem de exclus�o com sucesso.
	 * 
	 * @return Mensagem.
	 */
	public static String msgCustomerDeletedSuccess() {
		return "Your data has been successfully deleted from the database.";
	}

	/**
	 * Mensagem de confirma��o de exclus�o para um cliente.
	 * 
	 * @return Mensagem.
	 */
	public static String msgConfirmCustomerForDeletion() {
		return "Are you sure that you want to delete this 1 item?";
	}

	/**
	 * Mensagem parcial de confirma��o de exclus�o para mais de um cliente.
	 * 
	 * @return Mensagem.
	 */
	public static String msgConfirmCustomersForDeletion() {
		return "Are you sure that you want to delete";
	}
}