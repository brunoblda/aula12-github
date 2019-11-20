package secao8;

import java.util.Scanner;

import secao8.Empregado;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Empregado em = new Empregado();
	
		
		System.out.print("Nome: ");
		em.nome = sc.nextLine();
		
		System.out.print("Salario bruto: ");
		em.salario = sc.nextDouble();
		
		System.out.print("Impostos: ");
		em.imposto = sc.nextDouble();
		
		
		System.out.println();
		
		
		System.out.println("Empregado - "+ em);
		
		System.out.println("Digite a porcentagem de aumento de salário: ");
		em.aumentoSalario(sc.nextDouble());
		
		System.out.println();
		
		System.out.println("Atualizado: "+ em);
		
		
		sc.close();
			
	}

}
