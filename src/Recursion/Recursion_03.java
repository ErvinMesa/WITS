package Recursion;

public class Recursion_03 {
    public static void main(String[] args) {
        System.out.println(triangle(3));
    }
    public static int triangle(int num){
        if(num == 1){
            return 1;
        }
        return num+triangle(--num);

    }
}
