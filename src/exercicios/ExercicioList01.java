package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioList01 {

	public static void main(String[] args) {
		String cor; 
		ArrayList <String> cores = new ArrayList <String>();
		Scanner leia = new Scanner(System.in);

		for(int contador =1; contador<6; contador++) {
			System.out.println("Digite a " + contador + "º cor desejada: ");
			cor = leia.nextLine();
			cores.add(cor);
		}
		System.out.println("*************Lista de Cores*************");
		for(String c : cores) {
			System.out.println(c);
		}
		
		System.out.println("\n*************Cores ordenadas*************");
		Collections.sort(cores);
		for(String c : cores) {
			System.out.println(c);
		}

		
	}

}
