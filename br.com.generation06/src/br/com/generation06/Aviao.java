package br.com.generation06;


public class Aviao {

	String modelo;
	String marca;
	int ano;
	int velocidade;
	boolean ligado;

	void ligar() {
		ligado = true;
		System.out.println("Decolando ....");
	}
	void pousar() {
		ligado = false;
		System.out.println("Pousando....");
	}

	void velocidade() {
		velocidade++;
	}

	void desacelerar() {
		velocidade--;
	}
}
