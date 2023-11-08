package aula_02;

import java.util.Scanner;

public class Exercicio01 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite o valor do salário: R$ ");
		salario = leia.nextFloat();
		System.out.println("Digite o valor do Abono: R$ ");
		abono = leia.nextFloat();
		
		
		novoSalario = salario + abono;
		System.out.printf("O valor do salário mais abono é  R$ %.2f", novoSalario);
		
	}

}
