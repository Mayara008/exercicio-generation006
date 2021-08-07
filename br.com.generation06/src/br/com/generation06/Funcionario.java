package br.com.generation06;



package Funcionario;

public class Funcionario {

	public String nome;
	public int idade;
	public String Cargo;
	public String empresa;
	public String cidade;
	public boolean status;

	public void statusA() {
		System.out.println("Esta ativo");
		status = true;
	}
	public void statusB() {
		status = false;
		System.out.println("Desligado");
	}
}
