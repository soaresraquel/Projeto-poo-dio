package desafio.poo.dio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso("Java IDEs", "Aprendendo a utilizar algumas IDEs", 8);
			
		Curso curso2 = new Curso("Git/GitHub", "Aprendendo alguns comandos", 4);

		Curso curso3 = new Curso("Estrutura de Dados", "Aprendendo estrutura de dados em Java", 5);
		
		Mentoria mentoria1 = new Mentoria("Introdução Java", "Primeira mentoria de Java", LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);		
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos de Maria: " + devMaria.getConteudosInscritos());
		devMaria.progredir();
		System.out.println("Xp: " + devMaria.calcularTotalXp() + "\n");
		System.out.println("Conteudos Inscritos de Maria: " + devMaria.getConteudosInscritos());
		System.out.println("\nConteudos Concluidos de Maria: " + devMaria.getConteudosConcluidos());
		devMaria.progredir();
		System.out.println("Xp: " + devMaria.calcularTotalXp() + "\n");
		System.out.println("Conteudos Inscritos de Maria: " + devMaria.getConteudosInscritos());
		System.out.println("\nConteudos Concluidos de Maria: " + devMaria.getConteudosConcluidos());
		devMaria.progredir();
		System.out.println("Xp: " + devMaria.calcularTotalXp() + "\n");
		System.out.println("Conteudos Inscritos de Maria: " + devMaria.getConteudosInscritos());
		System.out.println("\nConteudos Concluidos de Maria: " + devMaria.getConteudosConcluidos());
		devMaria.progredir();
		System.out.println("Xp: " + devMaria.calcularTotalXp() + "\n");
		System.out.println("Conteudos Inscritos de Maria: " + devMaria.getConteudosInscritos());
		System.out.println("\nConteudos Concluidos de Maria: " + devMaria.getConteudosConcluidos());
		
		System.out.println("\n*******************************************************************\n");
		
		Dev devRaquel = new Dev();
		devRaquel.setNome("Raquel");
		System.out.println("Conteudos Inscritos de Raquel: " + devRaquel.getConteudosInscritos() + "\n");
		devRaquel.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos de Raquel: " + devRaquel.getConteudosInscritos());
		devRaquel.progredir();
		System.out.println("Xp: " + devRaquel.calcularTotalXp() + "\n");
		System.out.println("\nConteudos Concluidos de Raquel: " + devRaquel.getConteudosConcluidos());
	}

}
