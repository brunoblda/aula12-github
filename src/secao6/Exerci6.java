package secao6;

import java.util.Locale;
import java.util.Scanner;

public class Exerci6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc= new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o numero: ");
		n=sc.nextInt();
		
			
		for (int i=n;i>=1;i--) {
			
			if (n%i == 0) {
				System.out.println(i);
			}
			
		}
		
		
		sc.close();
		
	}

}
