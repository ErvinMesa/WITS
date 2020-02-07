package Classes;

public class Student {
    /** Attributes/Properties   **/
    String name;
    int studentNumber;
    int age;
    private int password = 1;
    /** Constructor **/
    public Student(){

    }
    /** Methods  **/
    public String getName(){
        return this.name;
    }
    public int getStudentNumber(){
        return this.studentNumber;
    }
    public int getAge(){
        return this.age;
    }
    private int getPassword(){return this.password;}
    public int getEncryptedPassword(){return getPassword()+1;}

    public void setName(String name){
        this.name = name;
    }
    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }
    public void setAge(int age){
        this.age = age;
    }
}
