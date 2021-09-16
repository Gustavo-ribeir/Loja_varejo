package varejo;

public class Vendas {

	public String vendedor;
	private String horavenda;
	private String ganho;
	private String quantidade;
	
	public Vendas(String vendedor, String hora, String ganho) {
		this.vendedor = vendedor;
		this.ganho = ganho;
		this.horavenda = hora;
		
	}
	

	public String getHoravenda() {
		return horavenda;
	}
	public String getGanho() {
		return ganho;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setHoravenda(String horavenda) {
		this.horavenda = horavenda;
	}
	public void setGanho(String ganho) {
		this.ganho = ganho;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return String.format("o vendedor foi %s, o ganho foi %s, a hora da venda foi %s",this.vendedor,this.ganho,this.horavenda);
		
	}
	
	
	
	
}
