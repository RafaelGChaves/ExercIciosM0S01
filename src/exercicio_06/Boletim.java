package exercicio_06;

import java.util.Scanner;

public class Boletim {
	
	public static void main(String[] args) {
		
		double Nota1;
		double Nota2;
		double Nota3;
		double Media;
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos fazer seu boletim");
		System.out.println("Insira o valor da primeria nota:");
		Nota1 = scanner.nextDouble();
		
		System.out.println("Insira o valor da segunda nota:");
		Nota2 = scanner.nextDouble();
		
		System.out.println("Insira o valor da terceira nota:");
		Nota3 = scanner.nextDouble();
		Media = (Nota1 + Nota2 + Nota3) / 3;
		
		System.out.println("Sua média final é " + Media);
		
		
		
	}

}
