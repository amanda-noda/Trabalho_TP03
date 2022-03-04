package pessoa;

/**
 * Possui atributos com apenas dados pessoais, alem de gets, sets, e
 * construtores.
 * 
 * @author Amanda Fernandes Custodio
 */

public class Pessoa {
	
	protected String nome;
	private String sexo;
	private String estadoCivil;
	private String naturalidade;
	private String endereco;
	private String email;
	private String escolaridade;
	private String filiacao;
	private String rg;
	private String cpf;
	private String telefone;

	/**
	 * Construtor que recebe apenas o nome da pessoa.
	 * 
	 * @param nome String com o nome.
	 */
	public Pessoa(String nome) {
		this.nome = nome;
	}

	/**
	 * Construtor que recebe todos os dados pessoais da pessoa.
	 * 
	 * @param nome         String com o nome.
	 * @param sexo         String com o sexo.
	 * @param estadoCivil  String com o estado civil.
	 * @param naturalidade String com a naturalidade.
	 * @param endereco     String com o endereco.
	 * @param email        String com o email
	 * @param escolaridade String com a escolaridade.
	 * @param filiacao     String com a filiacao.
	 * @param rg           String com o RG no formato "#.###.###".
	 * @param cpf          String com o CPF no formato "###.###.###-##".
	 * @param telefone     String com o telefone no formato "(##)####-####".
	 */
	public Pessoa(String nome, String sexo, String estadoCivil, String naturalidade, String endereco, String email,
			String escolaridade, String filiacao, String rg, String cpf, String telefone) {
		this.nome = nome;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.naturalidade = naturalidade;
		this.endereco = endereco;
		this.email = email;
		this.escolaridade = escolaridade;
		this.filiacao = filiacao;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereço) {
		this.endereco = endereço;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getFiliacao() {
		return filiacao;
	}

	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}

