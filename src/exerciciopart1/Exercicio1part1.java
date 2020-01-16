package exerciciopart1;

import java.util.Scanner;

public class Exercicio1part1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade por ano, mes e dia: ");
		int ano = sc.nextInt();
		int mes = sc.nextInt();
		int dia = sc.nextInt();
		int diaTotal = ano * 365 + mes * 30 + dia;
		System.out.println(ano + " anos, " + mes + " meses e " + dia + " dias = " + diaTotal + " dias.");
		sc.close();
	}
}
