package exerciciopart2_edipo;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*
		 * Fa�a um algoritmo que leia 20 n�meros e, ao final, escreva quantos est�o
		 * entre 0 e 100, quantos est�o entre 101 e 200 e quantos s�o maiores de 200
		 */
		Scanner sc = new Scanner(System.in);
		int sum0_100 = 0;
		int sum101_200 = 0;
		int sum = 0;
		for (int i = 0; i < 20; i++) {
			int n = sc.nextInt();
			if (n < 101 && n > -1)
				sum0_100 += 1;
			else if (n > 100 && n < 201)
				sum101_200 += 1;
			else
				sum += 1;
		}
		System.out.println("entre 0 a 100: " + sum0_100);
		System.out.println("entre 101 a 200: " + sum101_200);
		System.out.println("maiores que 200: " + sum);
		sc.close();
	}

}
