package varejo;

public class Fornecedores {

	private String nomeEmpresa;
	private String produto;
	private Endereco endereco;
	private String dataSaida;
	private String preco;
	
	public Fornecedores(String nomeEmpresa, String produto, String dataSaida, String preco) {
		this.nomeEmpresa = nomeEmpresa;
		this.produto = produto;
		this.dataSaida = dataSaida;
		this.preco = preco;
		
	}
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public String getProduto() {
		return produto;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public String getDataSaida() {
		return dataSaida;
	}
	public String getPreco() {
		return preco;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	
	@Override
	public String toString() {
		return String.format("o produto �: %s, a empresa � a: %s, a data de saida �: %s, o pre�o da %s �: %s",this.produto, this.nomeEmpresa,this.dataSaida,this.produto,this.preco);
	}
	
	
}
