package ClassRoom;

public class Student {
    private final String name;
    private  int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void getInfo() {
        System.out.println(this.name + " " + this.score);
    }

    public String getName() {
        return name;
    }
}
