package Aula;

public class Arrays {

	public static void main(String[] args) {
		
		double[] salarios = new double[5]; //um arrays com 5 posi��es e campos.
		
		for (int i = 0; i<5; i++){ 
			salarios[i] = i + 1000;
			
			System.out.println ("Resultado �: " + salarios[i]);
		
		}
		
		int[] primosPequenos = {2, 3, 5, 7, 11, 13};
		
		for (int i = 0; i<6; i++) {
			System.out.println ("O Valor de primos pequenos �: " + primosPequenos[i]);
		}
		
		String[] cores = {"Vermelho", "Azul", "Amarelo"};
		
		for (int i = 0; i<3; i++) //i<3 = ser�o imprimidos 3 resultados.
			System.out.println ("As cores s�o:" + cores[i]);
	}
	
	
}