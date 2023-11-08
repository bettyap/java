package aula_02;

import java.util.Scanner;

public class Exercicio04 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float numero1, numero2, numero3, numero4, calculo;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = leia.nextFloat();
		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextFloat();
		System.out.print("Digite o terceiro número: ");
		numero3 =  leia.nextFloat();
		System.out.print("Digite o quarto número: ");
		numero4 = leia.nextFloat();
		
		calculo = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.printf("A diferença é %.1f", calculo);

	}

}
