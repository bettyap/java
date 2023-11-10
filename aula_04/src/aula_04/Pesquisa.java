package aula_04;

import java.util.Scanner;

public class Pesquisa {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade, esporte, futebol=0, voleiMai18=0, basqueteMen18=0, outros=0;
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			System.out.print("Digite a sua idade: ");
			idade = leia.nextInt();
			
			do {
				System.out.print("Digite seu Esporte favorito (1-Fut / 2-Vol/ 3-Basq/ 4-Outros: ");
				esporte = leia.nextInt();
			} while(esporte < 1 || esporte > 4);
		
			//Qts pessoas gostam de futebol
			
			if(esporte == 1) 
				futebol++;
			
			//Qts pessoas gostam de volei e são maiores de 18 anos
			if(esporte == 2 && idade > 18) 
				voleiMai18++;
			
			//Qts pessoas gostam de basquete  e são menores de 18 anos
			if(esporte == 3 && idade < 18) 
				basqueteMen18++;
			
			
			//Qts pessoas gostam de outros esportes
			if(esporte == 4) 
				outros++;
			
			System.out.print("Deseja continuar (S/N)? ");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
		}
		
		System.out.println("Total de pessoas que gostam de futebol: " + futebol);
		System.out.println("Total de pessoas que gostam de volei e são maiores que 18 anos:: " + voleiMai18);
		System.out.println("Total de pessoas que gostam de basquete e são menores que 18 anos: " + basqueteMen18);
		System.out.println("Total de pessoas que gostam de outros esportes: " + outros);

	}

}
