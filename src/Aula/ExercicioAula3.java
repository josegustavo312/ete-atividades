package Aula;

import java.util.Scanner;

public class ExercicioAula3 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		double comprimento, largura, custo, preco, salario, desconto;
		int menu;
		String repetir;
		
		do{
		
		System.out.println ("\t Escolha o programa");
		System.out.println ("1 - Custo do piso.");
		System.out.println ("2 - Desconto do sal�rio.");
		System.out.print ("Digite a op��o: ");
		menu=entrada.nextInt();
		
		switch (menu) {
		
		case 1:
		
			System.out.println ("\t Custo do piso");
			System.out.println ("Digite do comprimento do piso: ");
			comprimento=entrada.nextDouble();
			System.out.println ("Digite a largura do piso: ");
			largura=entrada.nextDouble();
			System.out.println ("Digite o pre�o por metro quadrado do piso: ");
			System.out.print ("R$ ");
			preco=entrada.nextDouble();
			
			custo = comprimento * largura * preco;
			
			System.out.println ("O custo do piso � de: ");
			System.out.printf ("R$ %.2f\n", custo);
			
		break;
			
		case 2:
		
			System.out.println ("\t Desconto do sal�rio");
			System.out.println ("Digite o valor do sal�rio:");
			System.out.print ("R$ ");
			salario=entrada.nextDouble();
			
			if (salario<=1000){
				
				desconto = salario - ((salario * 10) / 100);
				System.out.println ("O valor do seu sal�rio � de:");
				System.out.printf ("R$ %.2f\n", desconto);
				
			}
			
			else if (salario>1000 && salario<=2000){
				
				desconto = salario - ((salario * 15) / 100);
				System.out.println ("O valor do seu sal�rio � de:");
				System.out.printf ("R$ %.2f\n", desconto);
				
			}
			
			else {
				
				desconto = salario - (salario * 20) / 100;
				System.out.println ("O valor do seu sal�rio � de:");
				System.out.printf ("R$: %.2f\n", desconto);

				
			}
			
			break;
			
			default:
			
			System.out.println ("\t Voc� s� pode digitar 1 ou 2.");
			
			break;
		
		}
		
		System.out.println ("");
		System.out.println ("Voc� deseja voltar ao programa?");
		repetir=entrada.next();
		}
	
		while (repetir.equals("sim"));
		
	}

}
