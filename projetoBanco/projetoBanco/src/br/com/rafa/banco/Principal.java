package br.com.rafa.banco;

public class Principal {

	public static void main(String[] args) {
		
		Clientes cliente1 = new Clientes("Rafael", 1234);
		
		cliente1.conta = new Contas();
				
		cliente1.conta.numero = 9999;
		
		System.out.println(cliente1.nome);
		
		System.out.println(cliente1.numeroCPF);
		
		System.out.println(cliente1.conta.getSaldo());
		
		
		//_______________________________________
		
		Contas conta1 = new Contas();
		
		conta1.numero = 8888;
		
		Clientes cliente2 = new Clientes("Fulano", 4321);
		
		cliente2.conta = conta1;
		
		Clientes cliente3 = new Clientes("Ciclano", 8765);
		
		//________________________________________
		
		System.out.println(cliente1.conta.getSaldo());
		
		cliente1.conta.setSaque(100);//Correto!
		
		System.out.println(cliente1.conta.getSaldo());
		
		//________________________________________

		
		
		//________________________________________
	}

}
