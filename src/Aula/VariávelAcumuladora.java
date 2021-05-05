package Aula;

public class VariávelAcumuladora {

	public static void main(String[] args) {
		
		int a, b;
		a = 1;
		b = 2;
		
		while (a < 100){
			a++;
			b = b + a;
		}
			System.out.println(b);

	}

}