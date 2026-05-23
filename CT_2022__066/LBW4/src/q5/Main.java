package q5;

public class Main {

    public static void main(String[] args) {

        // Lecturer Object
        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Dr. Perera");
        lecturer.setCourseTeaching("Object Oriented Programming");

        // Course Object
        Course course = new Course();
        course.setCourseName("Java Programming");
        course.setCourseCode("IT202");
        course.setLecturer(lecturer);

        // Student Object
        Student student = new Student();
        student.setStudentName("Nimal");
        student.setDegreeName("BSc IT");
        student.setCourseFollowing("Java Programming");

        // Display Details
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());

        System.out.println("Lecturer: "
                + course.getLecturer().getLecturerName());

        System.out.println("Student Name: "
                + student.getStudentName());

        System.out.println("Degree: "
                + student.getDegreeName());

        System.out.println("Course Following: "
                + student.getCourseFollowing());
    }
}