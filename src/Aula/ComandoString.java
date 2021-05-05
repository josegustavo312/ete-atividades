package Aula;

import java.util.Scanner;

public class ComandoString {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String fumar;
		
		System.out.println("Você fuma? ");
		fumar=entrada.next();
		
		if(fumar.equals("sim")){
			System.out.println("O fumo pode causar mal a saúde!");
		}
		
	}

}
