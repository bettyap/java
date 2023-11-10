package aula_03;

import java.util.Scanner;

public class Exercicio05 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, quantidade;
		float valorTotal = 0, preco = 0;
		
		System.out.println("Produtos");
		System.out.println("1 - Cachorro Quente");
		System.out.println("2 - X-Salada");
		System.out.println("3 - X-Bacon");
		System.out.println("4 - Bauru");
		System.out.println("5 - Refrigerante");
		System.out.println("6 - Suco de laranja");
		
		System.out.print("Código do Produto: ");
		numero = leia.nextInt();
		
		System.out.print("Quantidade: ");
		quantidade = leia.nextInt();
		
		
		switch(numero) {
			case 1: 
				preco=10;
				System.out.print("Produto: Cachorro Quente" );
				break;
			case 2: 
				preco = 15;
				System.out.print("Produto: X-Salada" );
				break;
			case 3: 
				preco = 18;
				System.out.print("Produto: X-Bacon" );
				break;
			case 4:
				preco = 12;
				System.out.print("Produto: Bauru" );
				break;
			case 5: 
				preco = 8;
				System.out.print("Produto: Refrigerante" );
				break;
			case 6: 
				preco = 13;
				System.out.println("Produto: Suco de laranja" );
				break;
		}
		
		valorTotal = quantidade * preco;
		System.out.printf("\nValor total: R$ %.2f ", valorTotal);

	}

}