package ArrayVetor;

import java.util.Scanner;

public class ArrayVetorAula {

	public static void main(String[] args) {
		
		
		float media [] = new float [3];
		float somaMedia=0, mediaGeral, n1, n2, n3, maiorMedia=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=0 ; x<3 ; x++ ) {
			
			System.out.println("Entre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("Entre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("Entre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			somaMedia += media[x];
			
			if(maiorMedia < media[x]) {
				maiorMedia = media[x];
			}
			
		}
		
		mediaGeral = somaMedia / 3;
		System.out.println("Media geral: " +mediaGeral);
		System.out.println("Maior media: "+maiorMedia);
		
		for(x=0; x<3; x++) {
			System.out.println("Media participante "+(x+1)+ " foi de: " +media[x]);
		}
		
		
		

	}

}
