package aula_07;

import java.util.Scanner;

public class Calculadora {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, opc;

		while (true) {

			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("0 - Sair");
			System.out.println("Qual a operação matemática você deseja realizar? ");
			opc = leia.nextInt();

			if (opc == 0) {
				sobre();
				System.exit(0);
			}

			System.out.print("Digite o primeiro número: ");
			num1 = leia.nextInt();

			System.out.print("Digite o segundo número: ");
			num2 = leia.nextInt();

			switch (opc) {
				case 1 -> System.out.println("Soma: " + somar(num1, num2));
				case 2 -> System.out.println("Subtrair: " + subtrair(num1, num2));
				case 3 -> System.out.println("Multiplicar: " + multiplicar(num1, num2));
				case 4 -> System.out.println("Dividir: " + dividir(num1, num2));
			}

		}

	}
	
	//Métodos com o mesmo nome e assinatura diferentes
	// se trata de uma sobrecarga de Método 

	static int somar(int num1, int num2) {
		return num1 + num2;
	}
	
	static float somar(float num1, float num2) {
		return num1 + num2;
	}

	static int subtrair(int num1, int num2) {
		return num1 - num2;
	}

	static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	static int dividir(int num1, int num2) {
		return num1 / num2;
	}

	static void sobre() {
		System.out.println("Calculadora com Métodos");
		System.out.println("Betty Aparecida");
	}

}
