package exerciciopart2_edipo;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Digite a idade de 20 pessoas");
		for (int i = 0; i < 20; i++) {
			int n = sc.nextInt();
			sum += n;
			if (i == 19) {
				sum /= 20;
				System.out.println(sum);
			}
		}
		sc.close();

	}

}
