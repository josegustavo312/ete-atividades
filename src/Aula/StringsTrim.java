package Aula;
import java.util.Scanner;


public class StringsTrim {

	public static void main(String[] args) {

		String senha;
		
		Scanner entrada = new Scanner (System.in);

		int a = 0;
		
		
		System.out.println("Por favor digite o caractere");
		System.out.println("Digite uma senha, no mínimo 8 caracteres");
		System.out.print("Senha: ");
		senha = entrada.next();

		while (a==0)	
			if(senha.length() < 8){	
				System.out.println("Por favor digite o caractere");
				System.out.println("Digite uma senha com 8 caracteres");
				System.out.print("Senha: ");
				senha = entrada.next();
		
		}else{
				
			System.out.println("\t Senha criada com sucesso!");
			
			break;
		}
				
	}

}
