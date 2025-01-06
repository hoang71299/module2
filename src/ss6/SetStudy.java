package ss6;

import java.util.HashSet;
import java.util.Set;

public class SetStudy {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "Hoang", 9.0));
		set.add(new Student(1, "Hoang", 9.0));
		set.add(new Student(2, "Hoai", 5));
		set.add(new Student(2, "Hoai", 5));
		System.out.println(set.size());

	}
}
