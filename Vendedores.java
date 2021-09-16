package varejo;

public class Vendedores {

	private String nomeVendedor;
	private String salario;
	private Endereco endereco;
	private String tempoEmpresa;
	private String cpf;
	
	
	public Vendedores(String nome, String salario, String  cpf) {
		this.nomeVendedor = nome;
		this.salario = salario;
		this.cpf = cpf;
		
	}
	public String getNomeVendedor() {
		return nomeVendedor;
	}
	public String getSalario() {
		return salario;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public String getTempoEmpresa() {
		return tempoEmpresa;
	}
	public String getCpf() {
		return cpf;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setTempoEmpresa(String tempoEmpresa) {
		this.tempoEmpresa = tempoEmpresa;
	}
	
	@Override
	public String toString() {
		return String.format("O nome do vendedor é%s, o salario dele é %s ",this.nomeVendedor,this.salario);
		
	}
	
	
	
}
