package Recursion;

import sun.rmi.runtime.NewThreadAction;

import java.util.Scanner;

public class PrimeNumber {
    static boolean checkPrime (int num,int i){
        if (i==1 ){
            return true;
        }
        else if (num %i == 0){
            return false;
        }
        //Recursive Call
            return checkPrime(num,i+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:-");
        int num = sc.nextInt();
        //Call Recursive function with i =2
        //if (checkPrime(num,2)){
            System.out.println("Number is prime number"+checkPrime(num,2));
            sc.close();
       // }
//        else {
//          //  System.out.println("The number is not prime");
//            return;
//        }

    }
}
