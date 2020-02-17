import ClassRoom.Student;
import ClassRoom.Teacher;

public class Application {

  public static void main(String[] args) {
    Student Cindy = new Student("Cindy", 80);
    Student Mary = new Student("Mary", 95);
    Teacher Solider = new Teacher("Solider", Mary);
    Teacher Bob = new Teacher("Bob", Cindy);
    Solider.setStudentScore(5);
    Bob.setStudentScore(5);
    Solider.getInfo();
    Bob.getInfo();
  }

}
