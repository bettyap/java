package aula06;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Aline");
		fila.add("Pedro");
		fila.add("Vinicius");
		fila.add("Luiza");
		fila.add("Maria");
		
		System.out.println(fila);
		
		fila.remove();
		System.out.println(fila);
		
		// mostra o primeiro elemento e não retira
		System.out.println(fila.peek());
		
		//Mostra o primeiro elemento e retira o mesmo
		System.out.println(fila.poll());
		
		System.out.println("A Maria está na fila?: " + fila.contains("Maria"));
		
		System.out.println("Número de elementos na fila: " + fila.size());
		
		
		
	}

}
