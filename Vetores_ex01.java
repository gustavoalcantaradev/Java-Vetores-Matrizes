package ArrayVetor;

import java.util.Scanner;

public class Vetores_ex01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vet [] = {2,5,1,3,4,9,7,8,10,6};
		int digite, x ;
		boolean procura = false;
		
		System.out.println("Escolha um número entre 1 e 10: ");
		digite = leia.nextInt();
		
		for(x = 0 ; x < vet.length; x++) {
			if(digite == vet[x]) {
				procura = true;
				System.out.println("O número " +digite+" está na posição " +x);
			}
		}
		if (! procura) {
			System.out.println("O número "+digite+ " não foi encontrado.");
		}
	}
}
