package exerciciopart2;

public class Exercicio9part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		int v1 = 1;
		int v2 = 0;
		while (v2 < 100) {
			System.out.println(v2);
			v1 = v1 + v2; // 1+0 1+1
			v2 = v1 - v2; // 1+0 3-1
		}
	}

}
