package secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exerci2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("digite o numero: ");
		num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Esse número é par");
		}
		else {
			System.out.println("Esse número é impar");
		}
		
		sc.close();
		
	}

}
