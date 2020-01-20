package exerciciopart2;

public class Exercicio9part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub usar a variavel i
		int v1 = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(v1);
			if (i == 0) {
				v1 = 1;
				System.out.println(v1);
			} else {
				v1 = v1 + (v1 - v1);
			}
		}
	}

}
