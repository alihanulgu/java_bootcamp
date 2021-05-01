

public class Instructor extends User {
    private String instructorNumber;
    private String LectureGiven;

    public Instructor(String instructorNumber, String lectureGiven) {
        super();
        this.instructorNumber = instructorNumber;
        this.LectureGiven = lectureGiven;
    }

    public Instructor() {

    }


    public String getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(String instructorNumber) {
        this.instructorNumber = instructorNumber;
    }

    public String getLectureGiven() {
        return LectureGiven;
    }

    public void setLectureGiven(String lectureGiven) {
        LectureGiven = lectureGiven;
    }



}


