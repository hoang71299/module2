package ss6.exercise.set;

import java.util.HashSet;

public class Exercise1 {


		public static void main(String[] args) {
			int[] arr = {1, 3, 4, 2, 7, 5, 7, 1, 3};

			int[] uniqueArr = removeDuplicates(arr);

			System.out.println("Danh sách mảng không trùng lặp:  ");
			for (int i : uniqueArr) {
				System.out.print(i + " ");
			}
		}

		public static int[] removeDuplicates(int[] arr) {
			HashSet<Integer> set = new HashSet<>();
			for (int i : arr) {
				set.add(i);
			}

			int[] uniqueArr = new int[set.size()];
			int index = 0;
			for (int i : set) {
				uniqueArr[index++] = i;
			}

			return uniqueArr;
		}
	}


