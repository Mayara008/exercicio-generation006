package br.com.generation06;


public class Patinete {

	public String tipo;
	public int rodas;
	public String material;
	public int velocidade;


	public void acelerar() {
		velocidade++;
	}

	public void desacelerar() {
		velocidade--;
	}
}
