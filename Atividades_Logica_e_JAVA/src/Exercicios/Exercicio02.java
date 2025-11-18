package Exercicios;

import java.util.*;

public class Exercicio02 {
	
	public static void numPar(ArrayList<Integer> numeros) {
		ArrayList<Integer> pares = new ArrayList<Integer>();
		
		for (int num : numeros) {
			
			if (num % 2 == 0) {
				pares.add(num);
				
			}
			
		}
		
		System.out.print("\nNÚMEROS PARES: " + pares);
	}
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		System.out.println("EXERCÍCIO 2:\n");
		System.out.println("Crie um programa que peça ao usuário uma quantidade de números inteiros para cadastrar em um");
		System.out.println("ArrayList. Depois, implemente uma função que receba este ArrayList e retorne um novo ArrayList");
		System.out.println("contendo somente os números pares. Ao final, exiba o resultado.\n");
		
		System.out.println("\n-- LISTA COM NÚMEROS PARES:\n");
		
		for (int i = 1; i <= 10; i++) { 
			System.out.print("Digite o " + i + "º número: ");
			int num = input.nextInt();
			
			numeros.add(num);
			
		}
		
		numPar(numeros);
		
		input.close();

	}
	
}