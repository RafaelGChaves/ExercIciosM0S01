package exercicio_10;

import java.util.Scanner;

public class Primo {
	
	public static void main(String[] args) {
		
		int numero;
		boolean primo = true;
		
		System.out.println("Digite um n�mero e veja se ele � primo:");
		
		Scanner scanner = new Scanner(System.in);
		numero = scanner.nextInt();
		
		for (int i = 2; i < numero ; i++) {
			if (numero % i == 0) {
				System.out.println("N�o � primo!");
				primo = false;
				break;
				
			}
			if (primo) {
				System.out.println("� primo!");
			}	
						
		}
			
	}

}
