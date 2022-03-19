package Recursion;
import java.util.Scanner;
public class CountDigitsOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("number Of Digits is "+countDigits(n));
    }
    static int countDigits(int n){
       //int ctr = 0;
       if (n == 0){
           return 0;
       }
        return n%10 + countDigits(n/10);
    }
}
