package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] pessoas = { "Maria", "João", "Fabi", "Jenni" };
		
		float [] notas = new float[5];
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Posição " + i + " = " + pessoas[i]);
		}
		
		System.out.println("\n");
		
//		for(int i = 0; i < 3; i++) {
//			
//			System.out.print("Digite um valor para a posição [" + i + "] = ");
//			notas[i] = leia.nextFloat();
//		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Posição " + i + " = " + notas[i]);
		}
		
		System.out.println("\n");
		
		Arrays.sort(pessoas);
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.println("Posição [" + i + "] = " + pessoas[i]);
		}
		
		System.out.println("\n");
		
		for(int i =  pessoas.length - 1; i >= 0; i--) {
			System.out.println("Posição [" + i + "] = " + pessoas[i]);
		}
		
		System.out.println("Localize o elemento da posiçõa 02: " + Arrays.binarySearch(pessoas, "Jenni"));
		
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].equalsIgnoreCase("Jenni"))
				System.out.println("\n Jenni está na posicao: " + i);
		}
		
		for(String pessoa : pessoas) {
			System.out.println(pessoa);
		}

	}

}
