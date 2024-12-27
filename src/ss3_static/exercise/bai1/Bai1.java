package ss3_static.exercise.bai1;

public class Bai1 {
    private  int id;
    private  String name;
    private  double score;
    private  static int count = 0;

    public Bai1(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        count++;
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


    public static int getCount() {
        return count;
    }


}