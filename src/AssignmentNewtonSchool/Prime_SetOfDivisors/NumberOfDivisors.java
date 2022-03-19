package AssignmentNewtonSchool.Prime_SetOfDivisors;

import java.util.Scanner;

public class NumberOfDivisors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
String s = "Vijay";
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=1;i<=Math.sqrt(arr[i]);i++){
            if (arr[i]%i==0){
                if (arr[i]/i==i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" "+(arr[i]/i)+" ");
                }
                System.out.println();
            }
        }
    }
}
