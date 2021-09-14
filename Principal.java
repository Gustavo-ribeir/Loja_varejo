package varejo;

public class Principal {
	public static void main(String[] args) {
		Endereco end1 = new Endereco();
		end1.setRua("Júlio de Castilhos");
		end1.setCidade("Caxias do Sul");
		end1.setBairro("Centro");
		end1.setCep("000");
	}	
	Clientes luiz = new Clientes("Luiz Gomes", "4322", "4284", "635156341");
	
	Estoque estado = new Estoque("Doritos", "100", "24/06");
	
	Fornecedores coca = new Fornecedores("Coca-Cola", "Coca-Cola", "30/5", "6,99");
	
	Produtos doritos = new Produtos("Doritos", "10,00", "12/12");
	
	Transportadora joaoentregas = new Transportadora("João Entregas", "Páliokkk", "100,00");
	
	Vendas jose = new Vendas("José Almasa", "57,00", "16:45");
			
	Vendedores rogerio = new Vendedores("Rogerio Richtofen", "2000,00", "060");
	
	
} 
