package exerciciopart2_edipo;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int par = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 20 n�meros");
		for (int i = 0; i < 20; i++) {
			int n = sc.nextInt();
			par = n % 2 == 0 ? par += 1 : par;
		}
		System.out.println(par + " n�meros s�o pares");
		sc.close();
	}

}
