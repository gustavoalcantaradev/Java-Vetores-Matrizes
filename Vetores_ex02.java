package ArrayVetor;

import java.util.Scanner;

public class Vetores_ex02 {

    public static void main(String[] args) {
        
    	
        int vet[] = new int [10];
        int somaVetor=0 ,x;
        float mediaVet;
        
        Scanner leia = new Scanner(System.in);  
        	
        for(x=0;x<10;x++) {
        	System.out.println("Entre com um número: ");
        	vet[x] = leia.nextInt();
        	
        	if(x % 2 == 1 ) {
        		System.out.println("Elemento de indice ímpar: " +vet[x]);
        	}
        	if(vet[x] % 2 == 0 ) {
        		System.out.println("O número: " +vet[x]+ " É um elemento par.");
        	}
        	somaVetor = somaVetor + vet[x];
        	
        }
        mediaVet = somaVetor / x;
        System.out.print("Soma dos elemento do vetor: " +somaVetor);
        System.out.println("\nA média dos elementos " +mediaVet);
     
    }
}

