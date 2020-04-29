package br.gb.sicredi.entities;

/**
 * Classe Entidade Customer (Cliente).
 * 
 * @author Giovanni Docter Brancher
 *
 */
public class Customer {

	/** Opção do Select Version. */
	private String selectVersion;
	/** Nome. */
	private String name;
	/** Último nome. */
	private String lastName;
	/** Primeiro nome para contato. */
	private String contactFirstName;
	/** Telefone. */
	private String phone;
	/** Primeiro endereço. */
	private String addressLine1;
	/** Segundo endereço. */
	private String addressLine2;
	/** Cidade. */
	private String city;
	/** Estado. */
	private String state;
	/** Código postal. */
	private String postalCode;
	/** País. */
	private String country;
	/** Empregador. */
	private String fromEmployeer;
	/** Limite de crédito. */
	private String creditLimit;

	/**
	 * Massa de dados padrão utilizada nos testes.
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
	 * Obtém a opção do Select Version.
	 * 
	 * @return A opção do Select Version.
	 */
	public String getSelectVersion() {
		return selectVersion;
	}

	/**
	 * Atribui uma opção ao Select Version.
	 * 
	 * @param opcao Select Version.
	 */
	public void setSelectVersion(String opcao) {
		this.selectVersion = opcao;
	}

	/**
	 * Obtém o nome do cliente.
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
	 * Obtém o último nome do cliente.
	 * 
	 * @return O último nome do cliente.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Atribui um último nome ao cliente.
	 * 
	 * @param lastName Último nome.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Obtém o primeiro nome para contato.
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
	 * Obtém o telefone do cliente.
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
	 * Obtém o primeiro endereço do cliente.
	 * 
	 * @return O primeiro endereço do cliente.
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * Atribui um primeiro endereço ao cliente.
	 * 
	 * @param addressLine1 Primeiro endereço.
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * Obtém o segundo endereço do cliente.
	 * 
	 * @return O segundo endereço do cliente.
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * Atribui um segundo endereço ao cliente.
	 * 
	 * @param addressLine2 Segundo endereço.
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * Obtém a cidade do cliente.
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
	 * Obtém o Estado do cliente.
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
	 * Obtém o código postal do cliente.
	 * 
	 * @return O código postal do cliente.
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Atribui um código postal ao cliente.
	 * 
	 * @param postalCode Código postal.
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * Obtém o país do cliente.
	 * 
	 * @return O país do cliente.
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Atribui um país ao cliente.
	 * 
	 * @param country País.
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Obtém o empregador do cliente.
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
	 * Obtém o limite de crédito do cliente.
	 * 
	 * @return O limite de crédito do cliente.
	 */
	public String getCreditLimit() {
		return creditLimit;
	}

	/**
	 * Atribui um limite de crédito ao cliente.
	 * 
	 * @param creditLimit Limite de crédito.
	 */
	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}
}
