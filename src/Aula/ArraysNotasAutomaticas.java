package Aula;

import java.util.Scanner;

public class ArraysNotasAutomaticas {

	public static void main(String[] args) {
		
		String repetir;
		double [] nota = new double [5];
		Scanner x = new Scanner (System.in);
		
		do{
		System.out.print("\n Calcular a Média das Notas \n");
		
		for (int i=0; i<4; i++){
			System.out.print("Informe a " + (i+1) + "º nota: ");
			nota[i] = x.nextDouble();
		}
		
		for (int i = 0; i < 4; i++){
			nota[4] = nota[4] + nota[i];
		}
		
		System.out.println("\n A média foi: " + nota[4]/4);
		
		System.out.println("\n Você deseja calcular de novo? S/N ");
		repetir = x.next();
		
		}
		
		while (repetir.equalsIgnoreCase("S")); {
			
		}
		
	}

}
