package secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import secao10.Empregado;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos empregados serão registrados: ");
		int numEmp = sc.nextInt();
		sc.nextLine();
				
		List<Empregado> list = new ArrayList<>();
		
		for (int i=0;i<numEmp;i++) {
			
			int n = i+1;
			
			System.out.println("\nEmpregado nº" + n);
			
			System.out.print("ID:");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome:");
			String nome = sc.nextLine();
			
			System.out.print("Salario:");
			double salario = sc.nextDouble();
			 
			
			list.add(new Empregado(nome, id, salario));
			
		}
		
		System.out.print("\n\nEntre com o ID do empregado que receberá aumento: ");
		int id = sc.nextInt();
		
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			
			System.out.println("Esse Id nao existe !");
		
		}else {
			
			System.out.print("\nEntre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			emp.aumento(porcentagem);
		
		}
		
		System.out.println("\nLista de empregados: ");
		
		for(Empregado auxEmp : list) {
			
			System.out.println(auxEmp);
			
		}
		
	
		
		sc.close();	
	}

}
