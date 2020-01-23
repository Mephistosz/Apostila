package exerciciopart2_edipo;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Digite 10 números para serem somados");
		for (int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			sum += n;
			if (i == 9)
				System.out.println(sum);
		}
		sc.close();
	}

}
