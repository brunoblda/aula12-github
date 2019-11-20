package secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exerci4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int h1,h2,horas;
		
		System.out.println("Digite os horarios do jogo: ");
		h1 = sc.nextInt();
		h2 = sc.nextInt();
		
		if(h1 == h2) {
			System.out.println("Esse jogo durou 24 horas");
		}
		else if(h1>h2) {
			horas = (24-h1)+h2;
			System.out.println("Esse jogo durou: "+ horas +" horas");
		}
		else {
			horas = h2-h1;
			System.out.println("Esse jogo durou: "+ horas +" horas");
		}
		
		sc.close();

	}

}
