package exerciciopart2_edipo;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão
		 * entre 0 e 100, quantos estão entre 101 e 200 e quantos são maiores de 200
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
