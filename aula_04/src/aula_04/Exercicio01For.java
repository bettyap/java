package aula_04;

import java.util.Scanner;

public class Exercicio01For {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1, numero2;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		if(numero1 < numero2) {
			System.out.printf("No Intervalo entre %d e %d: \n", numero1, numero2);
			for(int i=numero1; i <= numero2; i+=5) {
				if(i % 3 == 0 && i % 5 == 0)
				System.out.printf(i + " é múltiplo de 3 e 5 \n");
			}
			
		} else {
			System.out.println("Intervalo inválido!");
		}

	}

}
