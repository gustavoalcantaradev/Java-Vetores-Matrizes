package ArrayVetor;

import java.util.Scanner;

public class Matriz_ex02 {

	public static void main(String[] args) {
		
		float part[][] = new float[10][4];
		float media[] = new float [10];
		int x,y;
		float somaNota=0;
		
		Scanner leia= new Scanner(System.in);
		
		for (x=0 ; x<10 ; x++) {
			for(y=0; y<4 ; y++) {
				System.out.println("Entre com a " +(y+1)+ "º nota do aluno "+(x+1));
				part[x][y] = leia.nextFloat();
				somaNota = somaNota + part[x][y];
				
			}
			
			media[x] = somaNota/4;
			somaNota = 0;
			
	}
		for(x=0;x<10;x++) {
			System.out.println("A média do " +(x+1)+ "º participante foi de: " +media[x]);
		}

	}

}
