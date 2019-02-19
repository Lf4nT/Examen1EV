package fp.daw.examen;

public class Ejercicio1 {

	public static boolean contiene(String[] vector, String s) {
		int i = 0;
		while (i < s.length() && !vector[i].equals(s))
			i++;
		return i < s.length();
	}

	static String[] vector = { "lunes", "martes", "miércoles", "jueves", "viernes", "sabado", "domingo" };

	static void comprobar(String s) {
		System.out.println("\"" + s + "\"" + (contiene(vector, s) ? " " : " no ") + "está contenida en el vector");
	}

	public static void main(String[] args) {
		comprobar("hola");
		comprobar("lunes");
		comprobar("jueves");
		comprobar("domingo");
	}

}
