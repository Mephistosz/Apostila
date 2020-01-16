package exerciciopart1;

import java.util.Scanner;

public class Exercicio5part1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do salario minimo");
		double salarioMinimo = sc.nextInt();
		System.out.println("Digite o valor do salario do usuario");
		double salario = sc.nextInt();
		double qntsalarioMinimo = salario / salarioMinimo;
		System.out.printf("O usuario ganha %.2f", qntsalarioMinimo, "Salario minimo");
		sc.close();
	}
}
