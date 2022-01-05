package exercicio_07;

import java.util.Scanner;

public class Fatorial {
	
	// Crie um programa em Java que, utilizando a classe Scanner, calcule o fatorial
	// de um número inteiro de 0 a 10. O programa deve pedir para o usuário inserir
	// um número inteiro, mas só deve aceitar valores de 0 a 10, e então deve
	// calcular o fatorial desse número e escrever o resultado na tela.
	
		public static void main(String[] args) {
			
			int numDigitado;
			int i;
			int numFatoriado;
			
			System.out.println("Digite um número de 0 a 10 e descubra seu Fatorial.");
			
			Scanner scanner = new Scanner(System.in);
			numDigitado = scanner.nextInt();
				
			i = numDigitado;			
			numFatoriado = i;
			
				while (i > 10) {
					System.out.println("Digite um numero valido");
					numDigitado = scanner.nextInt();
					i = numDigitado;			
					numFatoriado = i;
					break;
				}
					
				while (i > 1 && i < 11) {
					numFatoriado = numFatoriado * (i - 1);
						i--;					
				}										
				System.out.println("O fatorial de " + numDigitado + " é " + numFatoriado + "!!!");			
											
		}
		
		
}

