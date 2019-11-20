package secao10;

import java.util.Scanner;

public class Aplicacao2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		System.out.print("Digite o nº de linhas: ");
		int m = sc.nextInt();
		
		System.out.print("Digite o nº de colunas: ");
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		int p = sc.nextInt();
		
		int[][] matriz = new int [m][n];
		
		System.out.println("\nDigite a matriz: ");
		
		for(int i = 0 ; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("\nDigite o número a ser encontrado: ");
		int x = sc.nextInt();		
		
		for(int i = 0 ; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				
				if (matriz[i][j] == x ) {
					
					System.out.println("\nPosição: "+ i +", "+ j);
					
					if((i-1) >= 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if((j+1) < matriz[i].length) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if((i+1) < matriz.length) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
					if((j-1) >= 0) {
						System.out.println("Left:" + matriz[i][j-1]);
					}
				}
						
						
			}
		}
		
		sc.close();
	}

}
