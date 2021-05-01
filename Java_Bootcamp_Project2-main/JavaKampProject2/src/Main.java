

public class Main {

    public static void main(String[] args) {


        User user = new User();
        user.setId(1);
        user.setFullName("Emre Keskin");
        user.setPassword("123");
        user.setEmail("apus6364@gmail.com");
        System.out.println(user.getFullName());

        UserManager userManager = new UserManager();
        userManager.login(user);
        userManager.logout(user);


        System.out.println("<<<<<<<<<>>>>>>>>");


        Instructor instructor = new Instructor();
        instructor.setId(2);
        instructor.setFullName("Engin Demirog");
        instructor.setEmail("engindemirog@hotmail.com");
        instructor.setInstructorNumber("12345");
        instructor.setLectureGiven("Java");
        System.out.println(instructor.getFullName());

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.courseInformation(instructor);

        System.out.println("<<<<<<<<<>>>>>>>>");


        Student student = new Student();
        student.setId(1);
        student.setFullName("Sadik Demir");
        student.setPassword("6363");
        student.setstdNumber("18210015");
        System.out.println(student.getFullName());

        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        studentManager.delete(student);
        studentManager.update(student);

    }



}
