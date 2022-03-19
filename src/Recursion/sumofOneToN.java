package Recursion;

import java.util.Scanner;

public class sumofOneToN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOnetoN(n));
    }
    static int sumOnetoN(int n){
        int result;
        if(n == 1){
            return 1;
        }
        else {
             result = n + sumOnetoN(n-1);
        }
        return result;
    }
}
