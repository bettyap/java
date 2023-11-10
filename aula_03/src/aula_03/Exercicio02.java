package aula_03;

import java.util.Scanner;

public class Exercicio02 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		if( numero % 2 == 0) {
			if (numero > 0 ) {
				System.out.printf("O número %s é par e positivo! ",numero);
			} else {
				System.out.printf("O número %s é par e negativo! ",numero);
			}
		} else {
			if (numero > 0 ) {
				System.out.printf("O número %s é ímpar e positivo! ",numero);
			} else {
				System.out.printf("O número %s é ímpar e negativo! ",numero);
			}
		}

	}

}
