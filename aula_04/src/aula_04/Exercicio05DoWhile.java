package aula_04;

import java.util.Scanner;

public class Exercicio05DoWhile {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			
			if(num > 0) {
				soma += num;
			}
			
		} while (num != 0);
		
		
		System.out.printf("A soma dos números positivos é: %d", soma);
	}

}
