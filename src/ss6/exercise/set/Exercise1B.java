package ss6.exercise.set;

import java.util.HashSet;

public class Exercise1B {
	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 2, 7, 5, 7, 1, 3};

		HashSet<Integer> set = new HashSet<>();
		int sum = 0;
		for (int i : arr) {
			if (!set.contains(i)) {
				set.add(i);
				sum += i;
			}
		}
		System.out.println("Tong cac phan tu trong mang: " + sum);
	}
}
