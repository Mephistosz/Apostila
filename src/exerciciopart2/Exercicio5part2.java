package exerciciopart2;

public class Exercicio5part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fatorial = 1;
		for (int i = 1; i <= 40; i++) {
			fatorial = (i * fatorial);
			System.out.println(i + " " + fatorial);
			//Porque o tipo int lê um valor até um limite.
		}
	}

}
