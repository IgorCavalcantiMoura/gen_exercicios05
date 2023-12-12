package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioList02 {

	public static void main(String[] args) {
		ArrayList <Integer> inteiros = new ArrayList <Integer>();
		int num;
		Scanner leia = new Scanner(System.in);

		inteiros.add(2);
		inteiros.add(5);
		inteiros.add(1);
		inteiros.add(3);
		inteiros.add(4);
		inteiros.add(9);
		inteiros.add(7);
		inteiros.add(8);
		inteiros.add(10);
		inteiros.add(6);
		
		System.out.println("Digite um número inteiro: ");
		num = leia.nextInt();
		
		inteiros.indexOf(num);
		
		if(inteiros.indexOf(num)!= -1) {
			System.out.println("O número " + num + " foi encontrado na posição " + inteiros.indexOf(num) + " da lista." );
		} else {
			System.out.println("O número " + num + " não foi encontrado na lista." );
		}
		
		
		
		
	}

}
