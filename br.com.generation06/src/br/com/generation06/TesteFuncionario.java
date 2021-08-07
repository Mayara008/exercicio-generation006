package br.com.generation06;


public class TesteFuncionario {
	public static void main(String[] args) {

		Funcionario fun1 = new Funcionario();

		fun1.nome = "Cleiton";
		fun1.idade = 23;
		fun1.empresa = "IBM";
		fun1.cidade = "Sao Paulo";
		fun1.Cargo = "Markting";

		System.out.println("Funcionario");
		System.out.println("Nome:" + fun1.nome);
		System.out.println("Idade:" + fun1.idade);
		System.out.println("Empresa:" + fun1.empresa);
		System.out.println("Cargo:" + fun1.Cargo);
		fun1.statusA();
	}
}
