package aula_05;

import java.util.Scanner;

public class Exercicio01Vet {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int buscarNum;
		boolean encontrado = false;
		
		System.out.print("Digite o número que você deseja encontrar: ");
		buscarNum = leia.nextInt();
		
		for(int i = 0; i < num.length; i++) {
			
			if(num[i] == buscarNum) {
				System.out.printf("O número %d está localizado na posição: %d", buscarNum, i );
				encontrado = true;
				break;
				
			}
		}
		
		if(!encontrado) {
			System.out.printf("O número %d não foi encontrado!", buscarNum);
		}
		
		
		

	}

}
