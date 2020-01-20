package exerciciopart2;

public class Exercicio6part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 1;
		int v2 = 0;
		for (int i = 0; i < 15; i++) {
			System.out.println(v2);
			v1 = v1 + v2; // 1+0 1+1
			v2 = v1 - v2; // 1+0 3-1 
		}
	}

}
