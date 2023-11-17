package org.example;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a Teacher
        Teacher teacher = new Teacher(1, "Domenic", "Java developer");

        // Create a list of Students
        Student student1 = new Student(1, "Ivan", "Raderberger str 117 a", 'A');
        Student student2 = new Student(2, "Mario", "Mark str 20 C", 'B');
        List<Student> students = Arrays.asList(student1, student2);

        // Create a Course
        Course course = new Course(10, "Web developer", teacher.name(),  Arrays.asList(student1,student2 ));


        // Access the fields directly
        System.out.println("Course ID: " + course.getId());
        System.out.println("Course Name: " + course.getName());
        System.out.println("Teacher: " + course.getTeacher());
        System.out.println("Students: " + course.getStudents());

        System.out.println();

        // Automatically generated toString method
        System.out.println("Course Details: " + course);

        // Automatically generated equals and hashCode methods
        Course anotherCourse = new Course(1, "Physics 101", teacher.subject(), students);
        System.out.println("Are the courses equal? " + course.equals(anotherCourse));
//        System.out.println("Hash code of course: " + course.hashCode());
//        System.out.println("Hash code of anotherCourse: " + anotherCourse.hashCode());


        System.out.println();
        // Step 5: Write a "Main" class where you apply some examples of
        // creating Students,
        // Create a Teacher,
        // and Courses using the constructors.


        // Create Students
        Student student11 = new Student(1, "Anton ", "Köln 50968", 'A');
        Student student21 = new Student(2, "Mario", "Berlin Raderberger str 23", 'B');

        // Create a Teacher
        Teacher teacher1 = new Teacher(1, "Domenic", "Web Developer");

        // Create a Course with a list of Students
        Course course1 = new Course(1, "Physics 101", teacher1.subject(), Arrays.asList(student1, student2));

        // Display Student details
        System.out.println("Student 11: " + student11);
        System.out.println("Student 22: " + student21);

        // Display Teacher details
        System.out.println("Teacher: " + teacher1);

        // Display Course details
        System.out.println("Course: " + course);


        System.out.println();
        //Mit @Builder annotation

        // Create Students using the Builder pattern
        Student student7 = Student.builder().id(1).name(" Alice").address(" Raderberger str 10 Köln").grade('A').build();
        Student student8= Student.builder().id(2).name(" Mario").address(" Erft str 1 Köln").grade('B').build();

        // Create a Teacher using the Builder pattern for a record
        Teacher teacher7 = Teacher.builder().id(1).name(" Domenic").subject(" Web Developer").build();

        // Create a Course with a list of Students using the Builder pattern
        Course course7 = Course.builder()
                .id(1)
                .name(" Java Course")
                .teacher(teacher7.name())
                .students(Arrays.asList(student1, student2))
                .build();

        // Display Student details
        System.out.println("Student 1: " + student7);
        System.out.println("Student 2: " + student8);

        // Display Teacher details
        System.out.println("Teacher: " + teacher7);

        System.out.println();
        // Display Course details
        System.out.println("Course: " + course7);
    }
}