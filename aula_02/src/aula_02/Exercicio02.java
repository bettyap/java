package aula_02;

import java.util.Scanner;

public class Exercicio02 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.print("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.print("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.print("Digite a quarta nota: ");
		nota4 = leia.nextFloat(); 
		
		media = (nota1+nota2+nota3+nota4) / 4 ;
		
		System.out.printf("A média é %.1f", media);
		
				
	}

}
