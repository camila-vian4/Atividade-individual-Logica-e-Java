package Exercicios;

import java.util.*;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<>();
		
		System.out.println("EXERCÍCIO 1:\n");
		System.out.println("Crie um programa em Java que utilize um ArrayList para armazenar nomes digitados pelo usuário.");
		System.out.println("O programa deve permitir que o usuário informe quantos nomes deseja cadastrar, usando uma estrutura de");
		System.out.println("repetição para coletá-los. Após isso, mostre todos os nomes cadastrados.\n");
		
		System.out.println("\n-- CADASTRO DE NOMES:\n");
		
		System.out.println("OBS: Para finalizar os cadastros digite fim.\n");
		
		while (true) {
			
			System.out.print("Informe o nome: ");
			String nome = input.nextLine();
			
			if (nome.equals("fim")) {
				break;
			
			}
			
			nomes.add(nome);
		}
		
		System.out.print("\nNOMES CADASTRADOS: \n\n");
		
		for (String n : nomes) {
			
			System.out.println(n);
			
		}
			
			input.close();
			
		}

	}