package exerciciopart1;

import java.util.Scanner;

public class Exercicio4part1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o codigo da pe�a");
	int codigo = sc.nextInt();
	System.out.println("Digite o valor da pe�a");
	double valor1 = sc.nextDouble();
	System.out.println("Digite a quantidade da pe�a");
	int quant1 = sc.nextInt();
	
	System.out.println("----------------------------------------------");
	
	System.out.println("Digite o codigo da pe�a");
	int codigo1 = sc.nextInt();
	System.out.println("Digite o valor da pe�a");
	double valor2 = sc.nextDouble();
	System.out.println("Digite a quantidade da pe�a");
	int quant2 = sc.nextInt();	
		
	int IPI= 10;	
		
	double totalSerPago = (valor1*quant1 + valor2*quant2)*(IPI/100 + 1);
	System.out.println("Valor para pagar as pe�as: " + totalSerPago);
	sc.close();
	}
}
