package aula06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio03Set {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> numeros = new HashSet<Integer>();
		int num;
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite %d" + "º número: ", i+1 );
			num = leia.nextInt();
			numeros.add(num);
		}
		
		Iterator<Integer> iNum = numeros.iterator();
		
		while(iNum.hasNext()) {
			System.out.println(iNum.next());
		}

	}

}
