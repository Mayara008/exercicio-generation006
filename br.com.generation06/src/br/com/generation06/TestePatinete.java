package br.com.generation06;


public class TestePatinete {
	public static void main(String[] args) {

		Patinete patinete1 = new Patinete();

		patinete1.tipo = "Manual";
		patinete1.rodas = 2;
		patinete1.material = "Plástico e metal";


		System.out.println("PATINETE");
		System.out.println("Tipo : \t\t"+ patinete1.tipo);
		System.out.println("Rodas : \t"+ patinete1.rodas);
		System.out.println("Material : \t"+ patinete1.material);


	}
}