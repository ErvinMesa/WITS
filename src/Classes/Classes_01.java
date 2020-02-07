package Classes;

public class Classes_01 {
    public static void main(String[] args) {
        Student student_1 = new Student();
        Student student_2 = new Student();

        student_1.setName("Ervin");
        student_1.setStudentNumber(123);
        System.out.println(student_1.getName());
        System.out.println(student_1.getStudentNumber());

        student_2.setName("Bryant");
        student_2.setStudentNumber(124);
        System.out.println(student_2.getName());
        System.out.println(student_2.getStudentNumber());
    }
}