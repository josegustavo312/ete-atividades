package Aula;

import java.util.Scanner;

public class ArraysNotas {

	public static void main(String[] args) {
		
		double [] nota = new double [5];
		Scanner x = new Scanner (System.in);
		
		System.out.print("Introduza a primeira nota: ");
		nota[0] = x.nextDouble();
		
		System.out.print("Introduza a segunda nota: ");
		nota[1] = x.nextDouble();
		
		System.out.print("Introduza a terceira nota: ");
		nota[2] = x.nextDouble();
		
		System.out.print("Introduza a quarta nota: ");
		nota[3] = x.nextDouble();
		
		for (int i = 0; i<4; i++){
			nota[4] = nota[4] + nota [i];
			System.out.println("Sua nota é: " +nota[i]);
		}

	}

}
