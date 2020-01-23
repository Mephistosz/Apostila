package exerciciopart2_edipo;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maiorQue8 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 20 números");
		for (int i = 0; i < 20; i++) {
			int n = sc.nextInt();
			maiorQue8 = n > 8 ? maiorQue8 += 1 : maiorQue8;
		}
		System.out.println(maiorQue8 + " números são maior que 8");
		sc.close();
	}

}
