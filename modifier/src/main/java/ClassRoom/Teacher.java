package ClassRoom;

public class Teacher {
    private final String name;
    private Student student;

    public Teacher(String name,Student student) {
        this.name = name;
        this.student = student;
    }

    public void getInfo() {
        System.out.println(this.name);
        this.student.getInfo();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setStudentScore(int addScore) {
        this.student.setScore(this.student.getScore() + addScore);
    }
}
