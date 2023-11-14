package ArrayVetor;

import java.util.Scanner;

public class MatrizArrayAula {

	public static void main(String[] args) {
		
		
		int matriz[][] = new int [3][3];
		int linha, coluna, somaDiagonal=0, somaDigsec=0;
		
		Scanner leia = new Scanner(System.in);
		
		for ( linha=0 ;linha <3 ;linha++ ) {
			for (coluna=0;coluna<3;coluna++) {
				System.out.println("Entre com um número: ");
				matriz[linha][coluna] = leia.nextInt();
				
				if(matriz[linha][coluna] % 5 ==0) {
					System.out.println("O número " +matriz[linha][coluna]+ "é multiplo por 5");
				}
				
				if (linha==coluna) {
					somaDiagonal += matriz[linha][coluna];
				}
				
				if((linha+coluna) == 2) {
					somaDigsec += matriz[linha][coluna];
				}
			}
		}
		
		System.out.println("Somatório da diagonal principal: "+somaDiagonal);
		System.out.println("Somatório da diagonal secundaria: " +somaDigsec);
	}

}
