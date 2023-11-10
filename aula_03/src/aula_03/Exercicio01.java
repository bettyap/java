package aula_03;

import java.util.Scanner;

public class Exercicio01 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c ;
		
		System.out.print("Digite o número A: ");
		a = leia.nextInt();
		
		System.out.print("Digite o número B: ");
		b = leia.nextInt();
		
		System.out.print("Digite o número C: ");
		c = leia.nextInt();
		
		if(a + b > c) {
			System.out.printf("A soma de A (%s) + B (%s) é maior do que C (%s)", a,b,c) ;
		}else if(a + b < c) {
			System.out.printf("A soma de A (%s) + B (%s) é menor do que C (%s)", a,b,c);
		} else {
			System.out.printf("A soma de A (%s) + B (%s) é igual a C (%s)", a,b,c);
		}
	}

}
