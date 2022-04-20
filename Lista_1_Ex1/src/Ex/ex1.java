package Ex;

import java.util.Scanner;

/*Fa�a um programa que
� leia N n�meros indicados pelo usu�rio
� exiba a m�dia aritm�tica
� exiba a m�dia geom�trica
� exiba os n�meros pares
� exiba os n�meros �mpares*/
public class ex1 {
	public void ex1() {
		// lendo a quantidade indicada pelo usu�rio
		Scanner leitor = new Scanner(System.in);
		System.out.println("Entre com a quantidade de n�meros que ser�o inseridos: ");
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
		// M�dia Aritm�tica
		System.out.print("M�dia Aritm�tica: ");
		int total = 0;
		float mediaA = 0;
		for (int i = 0; i < qtd; i++) {
			total += vetor[i];
			mediaA = total / qtd;
		}
		System.out.print(mediaA);
		System.out.println("");
		// --------------------------------------------
		// M�dia Geom�trica
		System.out.print("M�dia Geom�trica: ");
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
		// Mostrar os n�meros pares
		int parVet[] = new int[qtd];
		System.out.print("N�meros pares: ");
		for (int i = 0; i < qtd; i++) {
			if (vetor[i] % 2 == 0) {
				parVet[i] += vetor[i];
				System.out.print("|" + parVet[i] + "|");
			}
		}
		System.out.println("");
		// --------------------------------------------
		// Mostrar os n�meros �mpares
		int imparVet[] = new int[qtd];
		System.out.print("N�meros �mpares: ");
		for (int i = 0; i < qtd; i++) {
			if (vetor[i] % 2 == 1) {
				imparVet[i] += vetor[i];
				System.out.print("|" + imparVet[i] + "|");
			}
		}
	}
}
