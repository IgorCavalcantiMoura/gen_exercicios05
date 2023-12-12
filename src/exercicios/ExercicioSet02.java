package exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet02 {

	public static void main(String[] args) {
		Set <Integer> setInteiros = new HashSet <Integer>();
		int num;
		Scanner leia = new Scanner(System.in);
		
		setInteiros.add(2);
		setInteiros.add(5);
		setInteiros.add(1);
		setInteiros.add(3);
		setInteiros.add(4);
		setInteiros.add(9);
		setInteiros.add(7);
		setInteiros.add(8);
		setInteiros.add(10);
		setInteiros.add(6);
		
		System.out.println("digite um número inteiro: ");
		num = leia.nextInt();
		
		setInteiros.contains(num);
		
		if(setInteiros.contains(num)==true) {
			System.out.println("O número " + num + " foi encontrado!");
		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		}
	}

}
