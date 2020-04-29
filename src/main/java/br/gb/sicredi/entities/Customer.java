package br.gb.sicredi.entities;

/**
 * Classe Entidade Customer (Cliente).
 * 
 * @author Giovanni Docter Brancher
 *
 */
public class Customer {

	/** Op��o do Select Version. */
	private String selectVersion;
	/** Nome. */
	private String name;
	/** �ltimo nome. */
	private String lastName;
	/** Primeiro nome para contato. */
	private String contactFirstName;
	/** Telefone. */
	private String phone;
	/** Primeiro endere�o. */
	private String addressLine1;
	/** Segundo endere�o. */
	private String addressLine2;
	/** Cidade. */
	private String city;
	/** Estado. */
	private String state;
	/** C�digo postal. */
	private String postalCode;
	/** Pa�s. */
	private String country;
	/** Empregador. */
	private String fromEmployeer;
	/** Limite de cr�dito. */
	private String creditLimit;

	/**
	 * Massa de dados padr�o utilizada nos testes.
	 */
	public void defaultData() {
		this.setSelectVersion("Bootstrap V4 Theme");
		this.setName("Teste Sicredi");
		this.setLastName("Teste");
		this.setContactFirstName("seu nome");
		this.setPhone("51 9999-9999");
		this.setAddressLine1("Av Assis Brasil, 3970");
		this.setAddressLine2("Torre D");
		this.setCity("Porto Alegre");
		this.setState("RS");
		this.setPostalCode("91000-000");
		this.setCountry("Brasil");
		this.setFromEmployeer("Fixter");
		this.setCreditLimit("200");
	}

	/**
	 * Obt�m a op��o do Select Version.
	 * 
	 * @return A op��o do Select Version.
	 */
	public String getSelectVersion() {
		return selectVersion;
	}

	/**
	 * Atribui uma op��o ao Select Version.
	 * 
	 * @param opcao Select Version.
	 */
	public void setSelectVersion(String opcao) {
		this.selectVersion = opcao;
	}

	/**
	 * Obt�m o nome do cliente.
	 * 
	 * @return O nome do cliente.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Atribui um nome ao cliente.
	 * 
	 * @param name Nome.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Obt�m o �ltimo nome do cliente.
	 * 
	 * @return O �ltimo nome do cliente.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Atribui um �ltimo nome ao cliente.
	 * 
	 * @param lastName �ltimo nome.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Obt�m o primeiro nome para contato.
	 * 
	 * @return O primeiro nome para contato.
	 */
	public String getContactFirstName() {
		return contactFirstName;
	}

	/**
	 * Atribui um primeiro nome para contato.
	 * 
	 * @param contactFirstName Primeiro nome para contato.
	 */
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	/**
	 * Obt�m o telefone do cliente.
	 * 
	 * @return O telefone do cliente.
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Atribui um telefone ao cliente.
	 * 
	 * @param Telefone.
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Obt�m o primeiro endere�o do cliente.
	 * 
	 * @return O primeiro endere�o do cliente.
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * Atribui um primeiro endere�o ao cliente.
	 * 
	 * @param addressLine1 Primeiro endere�o.
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * Obt�m o segundo endere�o do cliente.
	 * 
	 * @return O segundo endere�o do cliente.
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * Atribui um segundo endere�o ao cliente.
	 * 
	 * @param addressLine2 Segundo endere�o.
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * Obt�m a cidade do cliente.
	 * 
	 * @return A cidade do cliente.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Atribui uma cidade ao cliente.
	 * 
	 * @param city Cidade.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Obt�m o Estado do cliente.
	 * 
	 * @return O Estado do cliente.
	 */
	public String getState() {
		return state;
	}

	/**
	 * Atribui um Estado ao cliente.
	 * 
	 * @param state Estado.
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Obt�m o c�digo postal do cliente.
	 * 
	 * @return O c�digo postal do cliente.
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Atribui um c�digo postal ao cliente.
	 * 
	 * @param postalCode C�digo postal.
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * Obt�m o pa�s do cliente.
	 * 
	 * @return O pa�s do cliente.
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Atribui um pa�s ao cliente.
	 * 
	 * @param country Pa�s.
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Obt�m o empregador do cliente.
	 * 
	 * @return O empregador do cliente.
	 */
	public String getFromEmployeer() {
		return fromEmployeer;
	}

	/**
	 * Atribui um empregador ao cliente.
	 * 
	 * @param fromEmployeer Empregador.
	 */
	public void setFromEmployeer(String fromEmployeer) {
		this.fromEmployeer = fromEmployeer;
	}

	/**
	 * Obt�m o limite de cr�dito do cliente.
	 * 
	 * @return O limite de cr�dito do cliente.
	 */
	public String getCreditLimit() {
		return creditLimit;
	}

	/**
	 * Atribui um limite de cr�dito ao cliente.
	 * 
	 * @param creditLimit Limite de cr�dito.
	 */
	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}
}
