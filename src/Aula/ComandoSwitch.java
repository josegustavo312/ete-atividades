package Aula;

import java.util.Scanner;

public class ComandoSwitch {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero=entrada.nextInt();
		
		switch (numero){
		
		case 1:		//Caso for 1:
			System.out.print("Esse é o numero 1");
			break;	//Serve para que o processo para antes de um case ou um default posterior
			
		default:	//Se não for:
			System.out.print("Esse é o número que vem depois do 1");
		}
	}

}
