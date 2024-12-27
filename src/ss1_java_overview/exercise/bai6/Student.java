package ss1_java_overview.exercise.bai6;

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



    public String getName() {

        return name;
    }

    public void setName(String name) {
        if(name.trim().equals("")){
            System.out.println("Lỗi name khong duoc de trong");
        }
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if( score >= 0 && score <= 10){
            this.score = score;
        }else{
            System.out.println("Diem khong hop le");
        }


    }
}
