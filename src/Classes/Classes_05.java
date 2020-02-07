package Classes;

public class Classes_05 {
    public static void main(String[] args) {
        Student student_1 = new Student();

        student_1.setName("Ervin");
        student_1.setStudentNumber(123);
        System.out.println(student_1.getName());
        System.out.println(student_1.getStudentNumber());
        System.out.println(student_1.getEncryptedPassword());
    }
}
