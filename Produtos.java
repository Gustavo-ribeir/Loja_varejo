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
	
	@Override
	public String toString() {
		return String.format("o produto � %s, o pre�o � %s, e a data de validade � %s", this.produto,this.preco,this.validade);
		
	}
}
