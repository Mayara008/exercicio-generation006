package br.com.generation06;



public class TestePaciente {
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente();

		paciente1.nome = "Clovis";
		paciente1.doenca = "Gripe";
		paciente1.situacao = "leve";
		paciente1.tratamento = "Repouso e remedios";

		System.out.println("Paciente   : "+paciente1.nome);
		System.out.println("Doença     : "+ paciente1.doenca);
		System.out.println("Situação   : "+ paciente1.situacao);
		System.out.println("Tratamento : "+ paciente1.tratamento);



	}
}