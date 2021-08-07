package br.com.generation06;



public class TestaCliente {
	public static void main(String[] args) {

		/*Instanciar objeto */
		Cliente c1 = new Cliente();

		c1.nome = "Fernando";
		c1.idade = 20;
		c1.cpf = 1236547845;

		System.out.println("-----Cliente-----");
		System.out.println("Nome: " + c1.nome);
		System.out.println("Idade: " + c1.idade);
		c1.comprar();


	}

}

