package secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exerci1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("digite o numero: ");
		num = sc.nextInt();
		
		if(num<0) {
			System.out.println("Esse número é negativo");
		}
		else {
			System.out.println("Esse número é positivo");
		}
		
		sc.close();
		
	}

}
