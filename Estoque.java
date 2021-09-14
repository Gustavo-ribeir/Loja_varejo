package varejo;


public class Estoque {

	private String produto;
	private String quantidade;
	private String dataChegada;
	private String seguranca;
	
	public Estoque(String produto, String quantidade, String dataChegada) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.dataChegada = dataChegada;
	}
	
	public String getProduto() {
		return produto;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public String getDataChegada() {
		return dataChegada;
	}
	public String getSeguranca() {
		return seguranca;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
		
		
		
	
}
