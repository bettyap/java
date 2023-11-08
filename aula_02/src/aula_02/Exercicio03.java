package aula_02;

import java.util.Scanner;

public class Exercicio03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.print("Digite o valor do salário bruto: R$ ");
		salarioBruto = leia.nextFloat();
		System.out.print("Digite o valor do adicional noturno R$ ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite o valor das horas extras R$ ");
		horasExtras = leia.nextFloat();
		System.out.print("Digite o valor dos descontos R$ ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("O Salário Liquído é R$ %.2f", salarioLiquido);

	}

}
