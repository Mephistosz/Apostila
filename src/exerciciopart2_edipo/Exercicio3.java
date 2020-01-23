package exerciciopart2_edipo;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = sc.next();
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " " + nome);
		}

		sc.close();
	}

}
