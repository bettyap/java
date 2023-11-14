package aula06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01List {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite %d" + "ª cor: ", i+1 );
			String cor = leia.next();
			cores.add(cor);
		}
		
		System.out.println("Listar todas as cores: " + cores);
		
		// Ordenamos os elementos em ordem crescente
		cores.sort(null);
		System.out.println("Ordenar as cores: " + cores);
	}

}
