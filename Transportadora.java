package varejo;

public class Transportadora {

	private String nomeEmpresa;
	private Endereco endereco;
	private String carroTransporte;
	private String custo;
	private String nomeTransportador;
	
	
	public Transportadora(String nome, String carro, String custo) {
		this.nomeEmpresa = nome;
		this.carroTransporte = carro;
		this.custo = custo;
		
		
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public String getCarroTransporte() {
		return carroTransporte;
	}
	public String getCusto() {
		return custo;
	}
	public String getNomeTransportador() {
		return nomeTransportador;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setCarroTransporte(String carroTransporte) {
		this.carroTransporte = carroTransporte;
	}
	public void setCusto(String custo) {
		this.custo = custo;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	
	
	@Override
	public String toString() {
		return String.format("o nome da transportadora é: %s, o carro usado é: %s, o custo da entrega é: %s",this.nomeEmpresa,this.carroTransporte,this.custo);
		
	}
	
	
	
	
}
