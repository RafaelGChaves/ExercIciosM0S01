package exercicio_04;

import java.util.Scanner;

public class CalcularComVirgula {
	
	public static void main(String[] args) {
		
		double NumeroDigitado;
		int DigitadoInteiro;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número com duas casas decimais.");
		NumeroDigitado = scanner.nextDouble();
		
		DigitadoInteiro = (int) NumeroDigitado;
		
		System.out.println("Seu numero inteiro é: " + DigitadoInteiro);
		
		
	}

}
