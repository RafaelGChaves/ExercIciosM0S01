package exercicio_10;

import java.util.Scanner;

public class Primo {
	
	public static void main(String[] args) {
		
		int numero;
		boolean primo = true;
		
		System.out.println("Digite um número e veja se ele é primo:");
		
		Scanner scanner = new Scanner(System.in);
		numero = scanner.nextInt();
		
		for (int i = 2; i < numero ; i++) {
			if (numero % i == 0) {
				System.out.println("Não é primo!");
				primo = false;
				break;
				
			}
			if (primo) {
				System.out.println("É primo!");
			}	
						
		}
			
	}

}
