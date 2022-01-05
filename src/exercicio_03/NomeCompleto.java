package exercicio_03;

import java.util.Scanner;

public class NomeCompleto {
	
	public static void main(String[] args) {
		
		
		String nome;
		String sobrenome;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva seu nome:");
		nome = scanner.nextLine();
		
		System.out.println("Agora por favor escreva o sobrenome:");
		sobrenome = scanner.nextLine();
		
		System.out.println("Olá " +
		nome + " " + sobrenome + "!!");
		
	}

}
