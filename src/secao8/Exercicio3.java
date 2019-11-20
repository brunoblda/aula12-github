package secao8;

import java.util.Scanner;

import secao8.Aluno;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Nota 1: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.print("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.print("Nota 3: ");
		aluno.nota3 = sc.nextDouble();
		
		aluno.notafinal();
		
		System.out.println(aluno);
		
		sc.close();
	}

}
