package varejo;

public class Produtos {

	public String produto;
	private Fornecedores fornecedores;
	public String preco;
	public String validade;
	
	public Produtos(String produto, String preco, String validade) {
		this.produto = produto;
		this.preco = preco;
		this.validade = validade;
		
	}
	public Fornecedores getFornecedores() {
		return fornecedores;
	}
	
	
}
