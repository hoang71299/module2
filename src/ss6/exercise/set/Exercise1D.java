package ss6.exercise.set;

import java.util.TreeSet;

public class Exercise1D {
	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 2, 7, 5, 7, 1, 3};

		TreeSet<Integer> set = new TreeSet<>();
		for (int i : arr) {
			set.add(i);
		}

		int min = set.first();
		int max = set.last();

		System.out.println("Phần tử nhỏ nhất: " + min);
		System.out.println("Phần tử lớn nhất: " + max);
	}
}
