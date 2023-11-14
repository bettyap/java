package aula_05;

import java.util.Scanner;

public class Exercicio04MatPro {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] notas = new float[2][4];
		float[] medias = new float[2];
		float soma = 0.0f;
		
		for(int indiceI = 0; indiceI < notas.length; indiceI++) {
			for(int indiceJ = 0; indiceJ < notas[indiceI].length; indiceJ++) {
				System.out.print("Digite a " + (indiceJ + 1) + "ª nota do participante " + (indiceI + 1) + ": " );
				notas[indiceI][indiceJ] = leia.nextFloat();
			}
		}
		
		for(int indiceI = 0; indiceI < notas.length; indiceI++) {
			for(int indiceJ = 0; indiceJ < notas[indiceI].length; indiceJ++) {
				soma += notas[indiceI][indiceJ];
			}
			
			medias[indiceI] = soma / notas[indiceI].length;
			soma = 0.0f;
		}
		
		for(int indice = 0; indice < medias.length; indice++) {
			System.out.println("\nMédia do participante " + (indice + 1) + ": " + medias[indice]);
		}
		
	}

}
