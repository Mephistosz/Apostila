package exerciciopart2_edipo;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maiorDeIdade = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a idade de 20 pessoas");
		for (int i = 0; i < 20; i++) {
			int n = sc.nextInt();
			maiorDeIdade = n >= 18? maiorDeIdade += 1 : maiorDeIdade;
		}
		System.out.println(maiorDeIdade + " pessoas são maiores de idade");
		sc.close();
	}

}
