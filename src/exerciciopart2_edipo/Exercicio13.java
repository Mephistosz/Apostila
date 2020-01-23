package exerciciopart2_edipo;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão
		// entre 0 e 100
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 20; i++) {
			int n = sc.nextInt();
			if (n < 101 && n > -1)
				sum += 1;
		}
		System.out.println(sum);
		sc.close();
	}
}
