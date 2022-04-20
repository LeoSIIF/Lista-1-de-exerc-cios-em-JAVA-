package Ex;

import java.util.Scanner;

public class ex2 {

	public void ex2() {
		int A = 0, B = 0, C = 0, D = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Entre com a quantidade de linhas da Matriz 1: ");
		A = leitor.nextInt();
		System.out.println("Entre com a quantidade de colunas da Matriz 1: ");
		B = leitor.nextInt();
		System.out.println("Entre com a quantidade de linhas da Matriz 2: ");
		C = leitor.nextInt();
		System.out.println("Entre com a quantidade de colunas da Matriz 2: ");
		D = leitor.nextInt();

		int[][] matriz1 = new int[A][B];
		int[][] matriz2 = new int[C][D];

		for (int i = 0; i < A; i++) {
			for (int j = 0; j < B; j++) {
				System.out.println("Digite o valor da posição da matriz 1[" + (i + 1) + "]" + "[" + (j + 1) + "]: ");
				matriz1[i][j] = leitor.nextInt();
			} // fim for j
		} // fim for i
		System.out.println(" -- Matriz 1 -- ");
		for (int i = 0; i < A; i++) {
			for (int j = 0; j < B; j++) {
				System.out.print("[" + matriz1[i][j] + "]");
			} // fim for j
			System.out.println("");
		} // fim for i

		// *---------------------------------------------*
		System.out.println("Diagonal Principal da Matriz 1");
		for (int i = 0; i < A; i++) {
			for (int j = 0; j < B; j++) {
				if (i == j) {
					System.out.print("[" + matriz1[i][j] + "]");
				} // fim if
				else {
					System.out.print("#");
				} // fim else
			} // fim for j
			System.out.println("");
		} // fim for i

		System.out.println("Diagonal Secundária da Matriz 1: ");

		for (int i = 0; i < A; i++) {
			for (int j = 0; j < B; j++) {
				if (j == A - 1 - i) {
					System.out.print("[" + matriz1[i][j] + "]");
				} // fim if
				else {
					System.out.print("#");
				} // fim else
			} // fim for j
			System.out.println("");
		} // fim for i
			// *---------------------------------------------*

		for (int i = 0; i < C; i++) {
			for (int j = 0; j < D; j++) {
				System.out.println("Digite o valor da posição da matriz 2[" + (i + 1) + "]" + "[" + (j + 1) + "]: ");
				matriz2[i][j] = leitor.nextInt();
			} // fim for j
		} // fim for i

		System.out.println(" -- Matriz 2 -- ");
		for (int i = 0; i < A; i++) {
			for (int j = 0; j < B; j++) {
				System.out.print("[" + matriz2[i][j] + "]");
			} // fim for j
			System.out.println("");
		} // fim for i
			// *---------------------------------------------*
		System.out.println("Diagonal Principal da Matriz 2: ");
		for (int i = 0; i < C; i++) {
			for (int j = 0; j < D; j++) {
				if (i == j) {
					System.out.print("[" + matriz2[i][j] + "]");
				} // fim if
				else {
					System.out.print("#");
				} // fim else
			} // fim for j
			System.out.println("");
		} // fim for i

		System.out.println("Diagonal Secundária da Matriz 2: ");

		for (int i = 0; i < C; i++) {
			for (int j = 0; j < D; j++) {
				if (j == A - 1 - i) {
					System.out.print("[" + matriz2[i][j] + "]");
				} // fim if
				else {
					System.out.print("#");
				} // fim else
			} // fim for j
			System.out.println("");
		} // fim for i
			// *---------------------------------------------*

		System.out.println(" Matriz 1 Transposta: ");
		int[][] matriztransposta1 = new int[B][A];
		for (int i = 0; i < B; i++) {
			for (int j = 0; j < A; j++) {
				matriztransposta1[i][j] = matriz1[j][i];
			} // fim for j
		} // fim for i

		// print
		for (int i = 0; i < B; i++) {
			for (int j = 0; j < A; j++) {
				System.out.print("[" + matriztransposta1[i][j] + "]");
			} // fim for j
			System.out.println("");
		} // fim for i
			// *---------------------------------------------*

		System.out.println(" Matriz 2 Transposta: ");
		int[][] matriztransposta2 = new int[D][C];
		for (int i = 0; i < D; i++) {
			for (int j = 0; j < C; j++) {
				matriztransposta2[i][j] = matriz2[j][i];
			} // fim for j
		} // fim for i

		// print
		for (int i = 0; i < D; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print("[" + matriztransposta2[i][j] + "]");
			} // fim for j
			System.out.println("");
		} // fim for i

		// *---------------------------------------------*

		System.out.println("Soma das Matrizes: ");
		int[][] matrizsoma = new int[A][B];
		if (A == C && B == D) {
			for (int i = 0; i < A; i++) {
				for (int j = 0; j < B; j++) {
					matrizsoma[i][j] = (matriz1[i][j] + matriz2[i][j]);
				} // fim for j
			} // fim for i

			// print
			for (int i = 0; i < A; i++) {
				for (int j = 0; j < B; j++) {
					System.out.print("[" + matrizsoma[i][j] + "]");
				} // fim for j
				System.out.println("");
			} // fim for i
		} // fim if
		else {
			System.out.println("Impossível somar as matrizes, pois possuem ordem diferentes");
		}
		// *---------------------------------------------*

		System.out.println("Multiplicação das Matrizes: ");
		int[][] matrizmultiplicacao = new int[A][B];
		if (B == C) {
			for (int i = 0; i < A; i++) {
				for (int j = 0; j < D; j++) {
					for (int k = 0; k < B; k++) {
						matrizmultiplicacao[i][j] += (matriz1[i][k] * matriz2[k][j]);
					} // fim for k
				} // fim for j
			} // fim for i
				// print
			for (int i = 0; i < A; i++) {
				for (int j = 0; j < D; j++) {
					for (int k = 0; k < B; k++) {
						System.out.print("[" + matrizmultiplicacao[i][j] + "]");
					} // fim for k
				} // fim for j
				System.out.println("");
			} // fim for i
		} // fim if
		else {
			System.out.println("Impossível multiplicar as matrizes");
		}

	} // fim public void ex2
} // fim public class ex2
