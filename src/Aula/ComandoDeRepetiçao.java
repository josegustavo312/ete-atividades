package Aula;

import java.util.Scanner;

public class ComandoDeRepetiçao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int a, b;
		String repetir;
		
		System.out.println("Você deseja entrar no programa sim ou não? ");
		repetir = entrada.next();
		
		while (repetir.equals("sim")){	
		
		System.out.println("\t Some dois números");
		
		System.out.print("Digite o 1º numero: ");
		a = entrada.nextInt();

		System.out.print("Digite o 2º numero: ");
		b = entrada.nextInt();
		
		System.out.println("O resultado da soma é: " + a+b);
		
		System.out.println("");
		System.out.println("Você deseja continuar o programa sim ou não? ");
		repetir = entrada.next();
		System.out.println("");
		
		}

	}

}
