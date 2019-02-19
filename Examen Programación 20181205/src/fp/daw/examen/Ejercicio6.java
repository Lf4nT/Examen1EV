package fp.daw.examen;

import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] vector = new int[r.nextInt(401) + 100];
		for (int i = 1; i < vector.length; i++)
			vector[i] = r.nextInt(1000001);
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < vector.length; i++) {
			int dif = vector[i] - vector[i - 1];
			if (dif < min)
				min = dif;
		}
		System.out.println("Diferencia mínima entre dos valores adyacentes: " + min);
	}

}
