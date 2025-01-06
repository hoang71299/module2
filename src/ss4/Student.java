package ss4;

public class Student extends Person {
	private double score;

	public Student() {
	}

	public Student(int id, String name, double score) {
		super(id, name);
		this.score = score;
	}


}
