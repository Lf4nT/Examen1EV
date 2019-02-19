package fp.daw.examen;

public class Ejercicio3 {

	public static void fix45(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length - 1; i++)
			if (nums[i] == 4 && nums[i + 1] != 5) {
				while (nums[j] != 5 || (j != 0 && nums[j - 1] == 4))
					j++;
				nums[j] = nums[i + 1];
				nums[i + 1] = 5;
			}
	}

	public static void mostrarVector(int[] vector) {
		System.out.print("[");
		for (int i = 0; i < vector.length; i++)
			System.out.print("'" + vector[i] + "'" + (i == vector.length - 1 ? "" : ", "));
		System.out.println("]");
	}

	public static void main(String[] args) {
		int[] vector = { 5, 4, 9, 4, 9, 5 };
		mostrarVector(vector);
		fix45(vector);
		mostrarVector(vector);
	}

}
