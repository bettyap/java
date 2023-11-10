package aula_04;

import java.util.Scanner;

public class Exercicio03While {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade=0, menor21=0, maior50=0;
		
		while(idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();

			if( idade > 0 && idade < 21) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			}
		}
		
		System.out.println("O total de pessoas menores de 21 anos: " + menor21);
		System.out.println("O total de pessoas maiores de 50 anos: " + maior50);
	}

}
