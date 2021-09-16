package varejo;


public class Clientes {

	private String nomeCompleto;
	private String rg;
	private String cpf;
	private String telefone;
	private Endereco endereco;
	
	public Clientes(String nome, String rg, String cpf, String telefone) {
		this.nomeCompleto = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;		
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
		
	
	public String getRg() {
		return rg;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	@Override
	public String toString() {
		return String.format("as informações do cliente são nome: %s , cpf: %s , rg: %s , telefone: %s",this.nomeCompleto, this.cpf, this.rg, this.telefone);
	}
	
	
	
}
