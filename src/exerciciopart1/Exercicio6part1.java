package exerciciopart1;

import java.util.Scanner;

public class Exercicio6part1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um número");
	int n = sc.nextInt();
	System.out.print("Antecessor " + (n - 1) + ", ");
	System.out.print("Sucessor: " +  (n + 1));
	sc.close();
	}
}
