package aula06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01Fila {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> clienteFila = new LinkedList<String>();
		int opc = -1;
		String nome = null;

		System.out.println("********************************************");
		System.out.println("1 - Adicionar Clientes na Fila");
		System.out.println("2 - Listar todos os Clientes");
		System.out.println("3 - Retirar Cliente da Fila");
		System.out.println("0 - Sair");
		System.out.println("********************************************");

		while (opc != 0) {
			System.out.print("Entre com a opção desejada: ");
			opc = leia.nextInt();

			switch (opc) {
				case 1:
					System.out.print("Digite o nome: ");
					leia.skip("\\R");
					nome = leia.nextLine();
					clienteFila.add(nome);
					System.out.println(clienteFila);
					System.out.println("Cliente Adicionado!\n");
					break;
				case 2:
					System.out.println("Lista de Cliente na Fila: ");
					System.out.println(clienteFila + "\n");
					break;
	
				case 3:
					if(!clienteFila.isEmpty()) {
						clienteFila.poll();
						System.out.println("Fila: ");
						System.out.println(clienteFila);
						System.out.println("O Cliente foi Chamado!\n");
						break;						
					}
					System.out.println("A fila está vazia!\n");
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
