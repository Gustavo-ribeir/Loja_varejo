package varejo;

public class Principal {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Pinheiro", "564", "Caxias do Sul", "Centro", "RS", "000");
		
	
	Clientes luiz = new Clientes("Luiz Gomes", "4322", "4284", "635156341");
	
	Estoque estado = new Estoque("Doritos", "100", "24/06");
	
	Fornecedores coca = new Fornecedores("Coca-Cola", "Coca-Cola", "30/5", "6,99");
	
	Produtos doritos = new Produtos("Doritos", "10,00", "12/12");
	
	Transportadora joaoentregas = new Transportadora("João Entregas", "Páliokkk", "100,00");
	
	Vendas jose = new Vendas("José Almasa", "57,00", "16:45");
			
	Vendedores rogerio = new Vendedores("Rogerio Richtofen", "2000,00", "060");
	
		
	
		System.out.println(endereco.toString());

		System.out.println(luiz.toString());
		
		System.out.println(estado.toString());
		
		System.out.println(coca.toString());
		
		System.out.println(doritos.toString());
		
		System.out.println(joaoentregas.toString());
		
		System.out.println(jose.toString());
		
		System.out.println(rogerio.toString());
		
		
		
		
		
	}
}	
	


	

	