package exercicio_09;

import java.util.Scanner;

public class Rodizio {
	
	public static void main(String[] args) {
		
		int i;
		int pedacosCalabresa;
		int pedacosMussarela;
		int pedacosPortuguesa;
		int total;
		boolean plural = true;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Envie:\n1 para Calabresa \n2 para Mussarela \n3 para Portuguesa \n0 se estiver satisteito");
		i = scanner.nextInt();
		
		pedacosCalabresa = 0;
		pedacosMussarela = 0;
		pedacosPortuguesa = 0;		
		total = pedacosCalabresa + pedacosMussarela + pedacosPortuguesa;
		
		while (i != 0) {
			total++;
			if (i == 1) {				
				pedacosCalabresa++;
				System.out.println("\nVoc� pediu Calabresa!!");						
				System.out.println("Gostaria de mais uma fatia? \n\nEnvie:\n1 para Calabresa \n2 para Mussarela \n3 para Portuguesa \n0 se estiver satisteito");
				i = scanner.nextInt();
											
			} else if(i == 2) {
				pedacosMussarela++;
				System.out.println("\nVoc� pediu Mussarela!!");		
				System.out.println("Gostaria de mais uma fatia? \n\nEnvie:\n1 para Calabresa \n2 para Mussarela \n3 para Portuguesa \n0 se estiver satisteito");
				i = scanner.nextInt();
				
			} else if(i == 3) {
				pedacosPortuguesa++;
				System.out.println("\nVoc� pediu Portuguesa");				
				System.out.println("Gostaria de mais uma fatia? \n\nEnvie:\n1 para Calabresa \n2 para Mussarela \n3 para Portuguesa \n0 se estiver satisteito");
				i = scanner.nextInt();
				
			} else {}
			
		while(i >= 4) {
				System.out.println("Insira um n�mero v�lido:");
				i = scanner.nextInt();	
			}			
				
		}
							
		System.out.println("Voce pediu " + total + " peda�os de pizzas, sendo:\n" + pedacosCalabresa++ + " peda�os de Calabresa;\n" + pedacosMussarela++ + " peda�os de Mussarela;\n" + pedacosPortuguesa++ + " peda�os de Portuguesa.");
		
	}

}
