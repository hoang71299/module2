package ss6;

import java.util.Objects;

public class Student {
	private int id;
	private String name;

	private double score;

	public Student(int id, String name, double score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return id == student.id && Objects.equals(name, student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
}
