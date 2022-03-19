package Recursion;

import java.util.Scanner;

public class fastPowerOfNumber {
   static int stepCount = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The value Of a :");
        int a = sc.nextInt();
        System.out.println("Enter The value Of b :");
        int b = sc.nextInt();
     System.out.println("The result is : "+fastPow(a,b));
     System.out.println(stepCount);
    }
    static int fastPow(int a,int b){
        stepCount++;
        if (b == 0){
            return 1;
        }
        if (b%2==0){
            return fastPow(a*a,b/2);
        }
        else {
            return a*fastPow(a,b-1);
        }
    }
}
