package Aula;

import java.util.Scanner;

public class SomaDeNumeros {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int a, b, resultado;
		
		
		System.out.println("Programa que calcula dois numeros");
		
		System.out.print("Digite o n�mero:");
		a=entrada.nextInt();
		
		System.out.print("Digite o segundo n�mero:");
		b=entrada.nextInt();
		
		resultado=a+b;
		
		System.out.print("O valor da soma �: " + resultado );
				
	
	}

}
