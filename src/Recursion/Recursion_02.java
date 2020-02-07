package Recursion;

public class Recursion_02 {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    public static int fib(int num){
        if  (num == 0){
            return 0;
        }
        if (num == 1){
            return 1;
        }
        return fib(num-2)+fib(--num);

    }
}
