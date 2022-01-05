package exercicio_05;

import java.util.Scanner;

public class DifAlfabetizacaoCriancas {
	
	public static void main(String[] args) {
		
		String Nome;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		Nome = scanner.nextLine();
		
		
		System.out.println("Seu nome possui " + Nome.length() + " letras.");
		
	}

}
