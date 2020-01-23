package exerciciopart2_edipo;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = sc.next();
		System.out.println("Digite quantas vezes você quer que seu nome seja repetido");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(nome);
		}
		sc.close();
	}

}
