package secao8;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Retangulo re = new Retangulo();
		
		System.out.println("Digite a altura e a largura do retangulo: ");
		re.altura = sc.nextDouble();
		re.largura = sc.nextDouble();
				
		System.out.println(re);
		
	 sc.close();			
	}

}
