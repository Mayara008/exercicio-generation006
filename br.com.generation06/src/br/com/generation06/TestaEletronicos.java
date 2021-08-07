package br.com.generation06;


public class TestaEletronicos {
	public static void main(String[] args) {

		Eletronicos M1 = new Eletronicos();

		M1.ano = 2020;
		M1.aparelho = "S10";
		M1.marca = "Samsung";
		M1.tipo = "Celular";

		System.out.println("---APARELHO ELETRONICO---");	
		System.out.println("O eletronico "  + M1.tipo + " e da marca " + M1.marca + " Modelo " + M1.aparelho);

	}
}