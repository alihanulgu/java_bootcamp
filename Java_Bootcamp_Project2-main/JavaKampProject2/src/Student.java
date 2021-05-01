
public class Student extends User{
    String stdNumber;

    public Student() {

    }

    public Student(String stdNumber) {
        super();
        this.stdNumber = stdNumber;
    }

    public String getstdNumber() {
        return stdNumber;
    }

    public void setstdNumber(String studentNumber) {
        this.stdNumber = stdNumber;
    }


}

