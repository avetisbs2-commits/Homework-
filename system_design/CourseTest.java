package system_design;

public class CourseTest {

    CourseTest(){

    }

    public static void main(String[] args) {

        Student s1 = new Student("Alen", 101);
        Student s2 = new Student("Levon", 102);
        Student s3 = new Student("Aram", 103);
        Student s4 = new Student("Mari", 104);
        Student s5 = new Student("Elen", 105);
        Student s6 = new Student("Hayk", 106);

        Course java = new Course("Java course", 10);
        Course phyton = new Course("Phyton course", 10);

        s1.enroll(java);
        s2.enroll(java);
        s3.enroll(java);

        s4.enroll(phyton);
        s5.enroll(phyton);
        s6.enroll(phyton);

        java.showStudents();
        phyton.showStudents();
    }
}