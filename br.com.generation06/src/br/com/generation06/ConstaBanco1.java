package br.com.generation06;


import java.util.Scanner;

public class TesteContaBanco {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		char op;
		double auxValor;

		ContaBanco conta = new ContaBanco();

		conta.numero = "789456124";
		conta.agencia = "0001";
		conta.banco = "BanZZai";
		conta.titular = "Fernando Marques";
		conta.saldo = 100.0;
		conta.limite = 5000.0;

		System.out.println("***** CONTA BANCÁRIA ******");

		System.out.println("Titular : " +conta.titular);
		System.out.println("Banco : "+conta.banco);
		System.out.println("Número : "+conta.numero);
		System.out.println("Agencia : "+ conta.agencia);
		System.out.println("Saldo Atual: "+conta.saldo + " | Limite disponivel : "+conta.limite);



		for(int i = 0; i < 10; i++) {
			System.out.println("\nDigite D para deposito ou S para saque: ");
			op = leia.next().toUpperCase().charAt(0);

			if(op == 'D') {

				System.out.println("Informe o valor para depósito: ");
				auxValor = leia.nextDouble();

				conta.depositar(auxValor);

			}
			else if(op == 'S') {

				System.out.println("Informe o valor para saque: ");
				auxValor = leia.nextDouble();

				conta.sacar(auxValor);
			}
			System.out.println("\nSaldo Atual: "+conta.saldo);
		}

		leia.close();
	}
}
