package system_design;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private int capacity;
    private ArrayList<Student> students;

    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (students.size() >= capacity) {
            System.out.println(courseName + " is full, cannot enroll " + student.getName());
            return;
        }
        students.add(student);
    }

    void showStudents() {
        System.out.println("Students in " + courseName + ":");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("    " + students.get(i));
        }
    }
}