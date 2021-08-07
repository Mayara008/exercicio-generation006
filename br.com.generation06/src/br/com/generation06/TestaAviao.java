package br.com.generation06;


public class TestaAviao {

	public static void main(String[] args) {

		Aviao Av1 = new Aviao();

		Av1.modelo = "Boeing";
		Av1.ano = 2018;
		Av1.marca = "latam";

		Av1.ligar();

		System.out.println("O " + Av1.modelo + " fabricado em " + Av1.ano + " esta em operação pela " + Av1.marca );

	}
}
