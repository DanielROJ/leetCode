package LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author droro
 *
 */

public class DividingNumbers {

	public static void main(String[] args) {
		List<Integer> arr = selfDividingNumbers(1, 22);

		for (Integer integer : arr) {
			System.out.println(integer);
		}

	}

	public static List<Integer> selfDividingNumbers(int left, int right) {

		List<Integer> arr = new LinkedList<Integer>();

		boolean rel = true;

		for (int i = left; i <= right; i++) {

			if (arrN(i)) {
				arr.add(i);
			}

		}

		return arr;
	}

	public static boolean arrN(int value) {

		int original = value;

		int x = value;

		while (x != 0) {

			int digito = x % 10;

			if (digito == 0 || original % digito != 0) {
				return false;
			}	
			x/=10;
		}

		return true;
	}

}
