package Aula;

import java.util.Scanner;

public class MediaNotas {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Calcule o valor da media");
		
		System.out.print("Digite a 1� nota:");
		nota1=entrada.nextDouble();
		
		System.out.print("Digite a 2� nota:");
		nota2=entrada.nextDouble();
		
		System.out.print("Digite a 3� nota:");
		nota3=entrada.nextDouble();
		
		System.out.print("Digite a 4� nota:");
		nota4=entrada.nextDouble();
		
		media=(nota1+nota2+nota3+nota4)/4;
		
		System.out.println("Sua m�dia anual foi: " +media);
		
		//identa��o = ser� a forma de como ser� organizado os comandos
		
		if(media>=6){
			System.out.println("Voce foi Aprovado.");
			System.out.println("Parab�ns");
		}
		
		else{ //coloca-se as chaves no comando else (se n�o) para poder concatenar com as linhas do comando if, sem as chaves o comando else pega a primeira linha
			System.out.println("Voce foi Reprovado.");
		}

		

	}

}
