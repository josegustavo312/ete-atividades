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
		System.out.println ("1 - Pre�o da xerox.");
		System.out.println ("2 - Manuten��o das m�quinas.");
		System.out.print ("Digite a op��o: ");
		menu=entrada.nextInt();
		
		switch (menu){
		
		case 1:
		
			System.out.println ("\t Saiba o valor da xerox");
			System.out.println ("Quantas xerox foram tirados? ");
			folha=entrada.nextDouble();
			
			if(folha<=100){
			
				xerox = folha * 0.25;
				System.out.println ("\t O valor da xerox � de: ");
				System.out.printf ("R$ %.2f\n", xerox);
			break;	
			}
				
				else
					
					xerox = folha * 0.20;
					System.out.println ("O valor da xerox � de: ");
					System.out.printf ("R$ %.2f\n", xerox);
			
					break;
		case 2:
		
			System.out.println ("\t Manuten��o das m�quinas");
			System.out.println ("Quantas pe�as foram com produzidas?");
			produzidas=entrada.nextDouble();
			System.out.println ("Quantas pe�as est�o com defeitos?");
			defeitos=entrada.nextDouble();
			
			porcetagem = (defeitos*100)/produzidas;
			
			System.out.printf ("O percentual � de: %.0f", porcetagem);
			System.out.println (" %");
			
			if(porcetagem>=10){
	
				System.out.println ("\t A m�quina precisa de manuten��o.");

			break;	
			}
				
				else
					
					System.out.println ("\t A m�quina n�o precisa de manuten��o.");
			break;
		
		default:
			
			System.out.println ("Op��o inv�lida!");
			System.out.println ("Voc� s� pode digitar n�meros de 1 a 2");
			System.out.print ("");
			
		}

		System.out.println("");
		System.out.println("Voc� deseja voltar ao programa? ");
		repetir = entrada.next();
	}
	
		while (repetir.equals("sim")); {
		
		}		
	}

}
