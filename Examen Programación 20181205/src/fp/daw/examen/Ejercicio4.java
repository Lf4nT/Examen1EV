package fp.daw.examen;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio4 {

	public static int[] arrayAleatorioOrdenado(int n) {
		Random r = new Random();
		int[] vector = new int[n];
		for (int i = 0; i < n; i++)
			vector[i] = r.nextInt(13580 - 975) + 975;
		Arrays.sort(vector);
		return vector;
	}

	public static void main(String[] args) {
		Ejercicio3.mostrarVector(arrayAleatorioOrdenado(10));
	}

}
