package ss6.exercise.set;

import java.util.HashSet;

public class Exercise1C {
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 4, 2, 7, 5, 7, 1, 3};
		int[] arr2 = {1, 4, 3, 8, 5, 7, 7, 1, 3};

		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();

		for (int num : arr1) {
			set1.add(num);
		}

		for (int num : arr2) {
			set2.add(num);
		}

		HashSet<Integer> commontElements = new HashSet<>(set1);
		commontElements.retainAll(set2);

		System.out.println("Các phần tử trùng nhau ");
		for (int i : commontElements) {
			System.out.print(i + " ");
		}
	}
}
