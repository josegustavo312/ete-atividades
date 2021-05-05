package Aula;

import java.util.Scanner;

public class SomaDeNumeros {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int a, b, resultado;
		
		
		System.out.println("Programa que calcula dois numeros");
		
		System.out.print("Digite o número:");
		a=entrada.nextInt();
		
		System.out.print("Digite o segundo número:");
		b=entrada.nextInt();
		
		resultado=a+b;
		
		System.out.print("O valor da soma é: " + resultado );
				
	
	}

}
