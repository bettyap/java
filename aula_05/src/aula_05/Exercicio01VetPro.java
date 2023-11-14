package aula_05;

import java.util.Scanner;

public class Exercicio01VetPro {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero, resultado = -1;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == numero) {
				resultado = i;
			}
		}
		
		if(resultado == -1) {
			System.out.printf("O número %d não foi encontrado!", numero);
		}else {			
			System.out.printf("\n O número %d foi localizado na posição %d.", numero,resultado);
		}
		

	}

}
