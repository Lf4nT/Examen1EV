package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[] unidades = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		Scanner s = new Scanner(System.in);
		String respuesta;
		int cantidad;
		do {
			do {
				System.out.println("¿Qué cantidad de euros deseas desglosar? ");
				if ((cantidad = s.nextInt()) < 1)
					System.out.println("La cantidad tiene que ser exacta y mayor que cero. Introdúcela de nuevo...");
			} while (cantidad < 1);

			for (int i = 0; i < unidades.length && cantidad > 0; i++) {
				if (cantidad >= unidades[i]) {
					int n = cantidad / unidades[i];
					cantidad = cantidad % unidades[i];
					System.out.println(n + (unidades[i] > 2 ? " billete" : " moneda") + (n > 1 ? "s" : "") + " de "
							+ unidades[i] + " euro" + (unidades[i] == 1 ? "" : "s"));
				}
			}

			System.out.println("¿Desglosar otra cantidad? (si/no): ");
			respuesta = s.next();
		} while (respuesta.toLowerCase().equals("si"));
	}

}
