package secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exerci3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int num1,num2;
		
		System.out.print("Digite 2 n�meros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1%num2 == 0 || num2%num1 == 0) {
			
			System.out.println("Esses n�meros s�o multiplo");
		}
		else {
			System.out.println("Esses n�meros nao s�o multiplo");
		}
		
		sc.close();

	}

}
