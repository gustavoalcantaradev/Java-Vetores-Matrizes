package ArrayVetor;

import java.util.Scanner;

public class Matriz_ex01 {

	public static void main(String[] args) {
		
		
		int matriz[][] = new int [3][3];
		int linha, coluna, somaDiagonal=0, somaDiagonalsec=0;
		
		Scanner leia = new Scanner (System.in);
		
		for ( linha = 0 ; linha < 3 ; linha++) {
			for(coluna = 0 ; coluna < 3 ; coluna ++) {
				System.out.println("Digite um número: ");
				matriz[linha][coluna] = leia.nextInt();
				
				if (linha==coluna ) {
					somaDiagonal = somaDiagonal + matriz[linha][coluna];
				}
				if ((linha+coluna) == 2 ) {
					somaDiagonalsec = somaDiagonalsec + matriz[linha][coluna];
				}
				
			}
				
			}
				
	    System.out.println("\nElementos da diagonal principal: " + matriz[0][0] + "," +matriz[1][1] + "," + matriz[2][2]);
	    System.out.println("\nElementos da diagonal secundária: " + matriz[0][2] + "," + matriz[1][1] + "," + matriz[2][0]);
	
		System.out.println("\nA somatória da diagonal é: " +somaDiagonal);
		System.out.println("A somatória da diagonal secundaria é:" +somaDiagonalsec);
		
	}

}
