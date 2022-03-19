package Recursion;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println(factorial(index));

    }
    static int factorial(int index){
        if (index == 0 || index == 1) {
            return 1;
        }
        return  index * factorial(index - 1);
    }
}
