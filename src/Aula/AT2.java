package Aula;

import java.util.Scanner;

public class AT2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
				
		int idade, menu, numero1, numero2, numero3;
		String nome, repetir;
		
		do{
		
		System.out.println ("\t Escolha o programa");
		System.out.println ("1 - Nome e idade.");
		System.out.println ("2 - Ordem decrescente.");
		System.out.print ("Digite a opção: ");
		menu=entrada.nextInt();
		
		switch (menu) {
		
		case 1:
		
			System.out.println ("\t Nome e Idade");
			System.out.println ("Digite o seu nome: ");
			nome=entrada.next();
			System.out.println ("Digite a sua idade: ");
			idade=entrada.nextInt();
			System.out.print ("O seu nome é " + nome);
			System.out.print (" e sua idade é " + idade);
			
			;
			
		break;
			
		case 2:
		
			System.out.println ("\t Ordem decrescente");
			System.out.print ("Digite um número:");
			numero1=entrada.nextInt();
			System.out.print ("Digite outro número:");
			numero2=entrada.nextInt();
			System.out.print ("Digite mais um número:");
			numero3=entrada.nextInt();
			
			if (numero1>numero2 && numero1>numero3 && numero2>numero3 && numero2<numero1 && numero3<numero1 && numero3<numero2){
				
				System.out.println (""+ numero1);
				System.out.println (""+ numero2);
				System.out.println (""+ numero3);
				
			}
			
			else if (numero2>numero3 && numero2>numero1 && numero3>numero1 && numero3<numero2 && numero1<numero2 && numero1<numero3){
				
				System.out.println (""+ numero2);
				System.out.println (""+ numero3);
				System.out.println (""+ numero1);
			}
			
			else if (numero3>numero2 && numero3>numero1 && numero2>numero1 && numero2<numero3 && numero1<numero2 && numero1<numero3){
				
				System.out.println (""+ numero3);
				System.out.println (""+ numero2);
				System.out.println (""+ numero1);
				
			}
			
			else if (numero1>numero2 && numero1>numero3 && numero3<numero1 && numero3>numero2 && numero2<numero1 && numero2<numero3){
				
				System.out.println (""+ numero1);
				System.out.println (""+ numero3);
				System.out.println (""+ numero2);
				
			}
			
			else if (numero2>numero1 && numero2>numero3 && numero1>numero3 && numero1<numero2 && numero3<numero1 && numero3<numero2){
				
				System.out.println (""+ numero2);
				System.out.println (""+ numero1);
				System.out.println (""+ numero3);
				
			}
			
			else {
				
				System.out.println (""+ numero3);
				System.out.println (""+ numero1);
				System.out.println (""+ numero2);
				
			}
			
			break;
			
			default:
			
			System.out.println ("\t Você só pode digitar 1 ou 2.");
			
			break;
		
		}
		
		System.out.println ("");
		System.out.println ("\t Você deseja voltar ao programa?");
		repetir=entrada.next();
		}
	
		while (repetir.equals("sim"));


	}

}
