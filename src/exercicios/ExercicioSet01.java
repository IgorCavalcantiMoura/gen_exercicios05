package exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet01 {

	public static void main(String[] args) {
		Set <Integer> setInteiros = new HashSet <Integer>();
		int num;
		Scanner leia = new Scanner(System.in);
		
		for(int contador =1; contador<11; contador++) {
			System.out.println("Digite o " + contador + "º número inteiro: ");
			num = leia.nextInt();
			setInteiros.add(num);
		}
		
		System.out.println("\n*************Dados Set*************");
		Iterator <Integer> isetInteiros = setInteiros.iterator();
		
		while(isetInteiros.hasNext()) {
			System.out.println(isetInteiros.next());
		}
		
		

	}

}
