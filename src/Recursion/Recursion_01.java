package Recursion;

public class Recursion_01 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int num){
        if(num < 1){
            return 1;
        }
        return num * factorial(--num);
    }
}
