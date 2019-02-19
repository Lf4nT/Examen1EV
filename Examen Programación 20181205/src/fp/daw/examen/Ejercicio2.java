package fp.daw.examen;

public class Ejercicio2 {

	static void mostrarVector(char[] vector) {
		System.out.print("[");
		for (int i = 0; i < vector.length; i++)
			System.out.print("'" + vector[i] + "'" + (i == vector.length - 1 ? "" : ", "));
		System.out.println("]");
	}

	public static void main(String[] args) {
		mostrarVector("Hola Mundo".toCharArray());
	}

}
