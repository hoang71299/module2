package ss6.exercise.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Ex2 {
	public static void main(String[] args) {
		List<String> name = Arrays.asList();

		Map<String, Integer> nameCount = new HashMap<>();

		for (String s : name) {
			nameCount.put(s, nameCount.getOrDefault(s, 0) + 1);
		}

		System.out.println("Tên xuất hiện 1 lần: ");
		for (String s : nameCount.keySet()) {
			if (nameCount.get(s) == 1) {
				System.out.println(s);
			}
		}

		System.out.println("Tên bị trùng lặp: ");
		for (String s : nameCount.keySet()) {
			if (nameCount.get(s) > 1) {
				System.out.println(s + " Xuất hiện " + nameCount.get(s) + " lần");
			}
		}
	}
}
