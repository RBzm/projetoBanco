package br.com.rafa.banco;

public class Clientes {

	String nome;
	int numeroCPF;//Modificar private não permite que outras classes utilizem o atributo ou método.
	
	Contas conta;
	
	//Construtor
	public Clientes(String nome, int number) {//Ao criar o new devemos informar os valores (ao instanciar).
		
		this.nome = nome;
		
		this.numeroCPF = number;
		
	    }
		
	}

