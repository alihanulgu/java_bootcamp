
public class StudentManager {
    public void add(Student student) {
        System.out.println(student.getFullName() + " Added!");
    }

    public void delete(Student student) {
        System.out.println(student.getFullName() + " Deleted!");
    }

    public void update(Student student) {
        System.out.println(student.getFullName() + " Updated!");
    }

}

