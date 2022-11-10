package br.com.rafa.banco;

public class Contas {
	
	int numero;
	
	private double saldo;
	
	void setSaque(double valor) {
		
		if(valor <= this.saldo) {
			
		this.saldo -= valor;
		
	   }
		
	}
	
	double getSaldo() {
		
		return this.saldo;
		
	}

}
