package Recursion;
import java.util.Scanner;
public class PrintNaturalNumber {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        int n = 1;
        System.out.println("The First 50 Natural number are:");
        printNaturalNum(n);
    }
    static void printNaturalNum(int n){
       if(n<=50){
           System.out.print(" "+n+ " ");
           printNaturalNum(n+1);
       }
    }
}
