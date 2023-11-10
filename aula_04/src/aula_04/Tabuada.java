package aula_04;

import java.util.Scanner;

public class Tabuada {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		for(int contador =1; contador <=10; contador ++) {
			System.out.println(numero + " X " + contador + " = " + (numero * contador));
		}

	}

}
