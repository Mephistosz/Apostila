package exerciciopart2_edipo;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova
		Scanner sc = new Scanner(System.in);
		int age = 0;
		String nome = null;
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o nome e a idade de uma pessoa");
			String tempnome = sc.next();
			int tempage = sc.nextInt();
			if (i == 0) {
				nome = tempnome;
				age = tempage;
			} else if (age >= tempage) {
				nome = tempnome;
				age = tempage;
			}
		}
		System.out.println(nome);
		System.out.println(age);
		sc.close();
	}
}
