package Aula;

import java.util.Scanner;

public class ComandoDoWhile {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		int a, b, soma;
		String repetir;
		
		do{
			
		System.out.println("\t Some dois números");
		
		System.out.print("Digite o 1º numero: ");
		a = entrada.nextInt();

		System.out.print("Digite o 2º numero: ");
		b = entrada.nextInt();
		
		soma=a+b;
		
		System.out.println("O resultado da soma é: " + soma);
		
		System.out.println("Você deseja somar de novo? ");
		repetir = entrada.next();
		
		}
		
		while (repetir.equals("sim")); {
		
		}
		
	}

}
