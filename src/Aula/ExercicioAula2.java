package Aula;

import java.util.Scanner;

public class ExercicioAula2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double folha, xerox, defeitos, produzidas, porcetagem;
		int menu;
		String repetir;
		
		do{
			
		System.out.println ("\t Escolha o programa");
		System.out.println ("1 - Preço da xerox.");
		System.out.println ("2 - Manutenção das máquinas.");
		System.out.print ("Digite a opção: ");
		menu=entrada.nextInt();
		
		switch (menu){
		
		case 1:
		
			System.out.println ("\t Saiba o valor da xerox");
			System.out.println ("Quantas xerox foram tirados? ");
			folha=entrada.nextDouble();
			
			if(folha<=100){
			
				xerox = folha * 0.25;
				System.out.println ("\t O valor da xerox é de: ");
				System.out.printf ("R$ %.2f\n", xerox);
			break;	
			}
				
				else
					
					xerox = folha * 0.20;
					System.out.println ("O valor da xerox é de: ");
					System.out.printf ("R$ %.2f\n", xerox);
			
					break;
		case 2:
		
			System.out.println ("\t Manutenção das máquinas");
			System.out.println ("Quantas peças foram com produzidas?");
			produzidas=entrada.nextDouble();
			System.out.println ("Quantas peças estão com defeitos?");
			defeitos=entrada.nextDouble();
			
			porcetagem = (defeitos*100)/produzidas;
			
			System.out.printf ("O percentual é de: %.0f", porcetagem);
			System.out.println (" %");
			
			if(porcetagem>=10){
	
				System.out.println ("\t A máquina precisa de manutenção.");

			break;	
			}
				
				else
					
					System.out.println ("\t A máquina não precisa de manutenção.");
			break;
		
		default:
			
			System.out.println ("Opção inválida!");
			System.out.println ("Você só pode digitar números de 1 a 2");
			System.out.print ("");
			
		}

		System.out.println("");
		System.out.println("Você deseja voltar ao programa? ");
		repetir = entrada.next();
	}
	
		while (repetir.equals("sim")); {
		
		}		
	}

}
