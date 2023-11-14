package aula06;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio02Pilha {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> livroPilha = new Stack<String>();
		
		int opc = -1;
		String livro;

		System.out.println("********************************************");
		System.out.println("1 - Adicionar Livro na pilha");
		System.out.println("2 - Listar todos os Livros");
		System.out.println("3 - Retirar Livro da pilha");
		System.out.println("0 - Sair");
		System.out.println("********************************************");
		
		while (opc != 0) {
			System.out.print("Entre com a opção desejada: ");
			opc = leia.nextInt();

			switch (opc) {
				case 1:
					System.out.print("Digite o nome: ");
					leia.skip("\\R");
					livro = leia.nextLine();
					livroPilha.add(livro);
					System.out.println(livroPilha);
					System.out.println("Livro Adicionado!\n");
					break;
				case 2:
					System.out.println("Lista de Livros na Fila: ");
					System.out.println(livroPilha + "\n");
					break;
	
				case 3:
					if(!livroPilha.isEmpty()) {
						livroPilha.pop();
						System.out.println("Pilha: ");
						System.out.println(livroPilha);
						System.out.println("Um Livro foi retirado da pilha!\n");
						break;
					}
					System.out.println("A Pilha está vazia!\n");
				case 0:
					System.out.println("Programa Finalizado!");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.\n");
					break;
			}
		}


	}

}
