package Aula;

import java.util.Scanner;

public class ComandoDeRepeti�ao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int a, b;
		String repetir;
		
		System.out.println("Voc� deseja entrar no programa sim ou n�o? ");
		repetir = entrada.next();
		
		while (repetir.equals("sim")){	
		
		System.out.println("\t Some dois n�meros");
		
		System.out.print("Digite o 1� numero: ");
		a = entrada.nextInt();

		System.out.print("Digite o 2� numero: ");
		b = entrada.nextInt();
		
		System.out.println("O resultado da soma �: " + a+b);
		
		System.out.println("");
		System.out.println("Voc� deseja continuar o programa sim ou n�o? ");
		repetir = entrada.next();
		System.out.println("");
		
		}

	}

}
