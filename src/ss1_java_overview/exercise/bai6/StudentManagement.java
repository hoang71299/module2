package ss1_java_overview.exercise.bai6;

public class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Toan", 9.0);
        System.out.println("Thong tin đầu");
        System.out.println("id = " + s1.getId());
        System.out.println("name = " + s1.getName());
        System.out.println("score = " + s1.getScore());

        s1.setName("Nguyen Van Toan");
        s1.setScore(10.0);

        System.out.println("Thong tin sau chinh sua");
        System.out.println("id = " + s1.getId());
        System.out.println("name = " + s1.getName());
        System.out.println("score = " + s1.getScore());

        s1.setName("");

    }
}
