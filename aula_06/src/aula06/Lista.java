package aula06;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Double> notas = new ArrayList<Double>();
		
		notas.add(7.0);
		notas.add(4.0);
		notas.add(2.0);
		notas.add(9.0);
		notas.add(4.0);
		
		for(var nota : notas) {
			System.out.println(nota);
		}
		
		System.out.println(notas);
		
		System.out.println("Posição do elemento 7: " + notas.indexOf(7.0));
		System.out.println("Existe o elemento 7? " + notas.contains(7.0));
		System.out.println("Elemento na posição 0: " + notas.get(0));
		
		notas.remove(4);
		
		System.out.println(notas);
		
		notas.forEach(System.out::println);
		
		notas.clear();
		
		System.out.println("A lista está vazia? " + notas.isEmpty());
		

	}

}
