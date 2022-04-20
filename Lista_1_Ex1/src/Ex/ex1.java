package Ex;

import java.util.Scanner;

/*Faça um programa que
· leia N números indicados pelo usuário
· exiba a média aritmética
· exiba a média geométrica
· exiba os números pares
· exiba os números ímpares*/
public class ex1 {
	public void ex1() {
		// lendo a quantidade indicada pelo usuário
		Scanner leitor = new Scanner(System.in);
		System.out.println("Entre com a quantidade de números que serão inseridos: ");
		int qtd;
		qtd = leitor.nextInt();
		int vetor[] = new int[qtd];
		for (int i = 0; i < qtd; i++) {
			System.out.println("Entre com os valores: " + "|" + (i + 1) + "|");
			vetor[i] = leitor.nextInt();
		} // fim for

		// --------------------------------------------
		// print vetor
		System.out.print("Valores: ");
		for (int i = 0; i < qtd; i++) {
			System.out.print("|" + vetor[i] + "|");
		} // fim for
		System.out.println("");
		// --------------------------------------------
		// Média Aritmética
		System.out.print("Média Aritmética: ");
		int total = 0;
		float mediaA = 0;
		for (int i = 0; i < qtd; i++) {
			total += vetor[i];
			mediaA = total / qtd;
		}
		System.out.print(mediaA);
		System.out.println("");
		// --------------------------------------------
		// Média Geométrica
		System.out.print("Média Geométrica: ");
		double mediaG = 0;
		double totalG = 1;
		double qtdG = 0;
		qtdG = qtd;
		for (int i = 0; i < qtd; i++) {
			totalG = totalG * vetor[i];
		mediaG = Math.pow(totalG, 1/qtdG);
		}
		System.out.format("%.2f", mediaG);
		System.out.println("");
		// --------------------------------------------
		// Mostrar os números pares
		int parVet[] = new int[qtd];
		System.out.print("Números pares: ");
		for (int i = 0; i < qtd; i++) {
			if (vetor[i] % 2 == 0) {
				parVet[i] += vetor[i];
				System.out.print("|" + parVet[i] + "|");
			}
		}
		System.out.println("");
		// --------------------------------------------
		// Mostrar os números ímpares
		int imparVet[] = new int[qtd];
		System.out.print("Números ímpares: ");
		for (int i = 0; i < qtd; i++) {
			if (vetor[i] % 2 == 1) {
				imparVet[i] += vetor[i];
				System.out.print("|" + imparVet[i] + "|");
			}
		}
	}
}
