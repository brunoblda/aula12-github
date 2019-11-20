package secao6;

import java.util.Locale;
import java.util.Scanner;

public class Exerci7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um numero: ");
		n = sc.nextInt();
		
		for (int i = 1; i<=n;i++) {
			
			int i2 = (int) Math.pow(i, 2);
			
			int i3 = (int) Math.pow(i, 3);
			
		System.out.printf(" %d %d %d \n", i, i2, i3);
		}
		
		sc.close();
		
		
	}

}
