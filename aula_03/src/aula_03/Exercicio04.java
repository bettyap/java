package aula_03;

import java.util.Scanner;

public class Exercicio04 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palavra1, palavra2, palavra3;
		
		
		System.out.println("Digite a primeira palavra: ");
		leia.skip("\\R");
		palavra1 = leia.nextLine();
		
		System.out.println("Digite a segunda palavra: ");
		leia.skip("\\R");
		palavra2 = leia.nextLine();
		
		System.out.println("Digite a terceira palavra: ");
		leia.skip("\\R");
		palavra3 = leia.nextLine();
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			
			if (palavra2.equalsIgnoreCase("äve")) {
				if (palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("águia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (palavra3.equalsIgnoreCase("herbivoro")) {
					System.out.println("vaca");
				} else {
					System.out.println("homem");
				}
			}
			
		} else {
			if (palavra2.equalsIgnoreCase("ïnseto")) {
				
			} else {
				
			}
		}
		
	}

}
