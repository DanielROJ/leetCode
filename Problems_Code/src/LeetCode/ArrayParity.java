package LeetCode;

public class ArrayParity {

	public static int[] init(int[] arr) {
		int[] aux = new int[arr.length];

		int index = 0;

		int h = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				aux[index] = (arr[i]);
				index++;
			} else {
				aux[h] = arr[i];
				h--;
			}
		}

		return aux;
	}

	public static void main(String[] args) {
		int[] b = { 1, 2, 3, 4, 5 };
		int[] p = init(b);
		for (int i : p) {
			System.out.println(i);
		}
	}

}
