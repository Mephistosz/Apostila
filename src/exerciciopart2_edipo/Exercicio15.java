package exerciciopart2_edipo;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = 1;
		int sum = 0;
		while (x > 0) {
			x = sc.nextInt();
			if (x < 0)
				break;
			sum += x;
			System.out.println(sum);
		}
		sc.close();
	}

}
