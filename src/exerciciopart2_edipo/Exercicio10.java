package exerciciopart2_edipo;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		for (int i = 0; i < 1; i++) {
			System.out.println("Digite um número");
			n = sc.nextInt();
			for (int j = 1; j < 11; j++) {
				int tabuada = n * j;
				System.out.println(tabuada);
			}
		}
		sc.close();
	}

}
