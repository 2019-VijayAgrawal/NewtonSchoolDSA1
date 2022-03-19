package Recursion;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println(reverseNumber(index));

    }
    static int reverseNumber(int index){
       int remainder;
       int sum = 0;
       while (index>0) {
           remainder = index % 10;
           sum = sum * 10 + remainder;
           index = index / 10;

       }
        return sum;
    }
}
