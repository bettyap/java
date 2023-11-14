package aula_05;

import java.util.Scanner;

public class Exercicio04Mat {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[][] notas = new float[10][4];
		float[] medias = new float [10];
		float soma = 0.0f;

		for (int indiceI = 0; indiceI < notas.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < notas[indiceI].length; indiceJ++) {
				System.out.print("Digite a " + (indiceJ + 1) + "ª nota do participante " + (indiceI + 1) + ": "  );
				notas[indiceI][indiceJ] = leia.nextFloat();
			}
		}
		
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas[i].length; j++) {
				soma += notas[i][j];
			}
			medias[i] = soma / notas[i].length;
			soma = 0.0f;
		}
		
		for(int i = 0; i < medias.length; i++) {
			System.out.printf("\nMédia do participante " + (i + 1) + ": %.1f", medias[i]);
		}
		

	}

}