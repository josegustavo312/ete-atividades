package Aula;

import java.util.Scanner;

public class ComandoSwitch {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Digite um n�mero: ");
		numero=entrada.nextInt();
		
		switch (numero){
		
		case 1:		//Caso for 1:
			System.out.print("Esse � o numero 1");
			break;	//Serve para que o processo para antes de um case ou um default posterior
			
		default:	//Se n�o for:
			System.out.print("Esse � o n�mero que vem depois do 1");
		}
	}

}
