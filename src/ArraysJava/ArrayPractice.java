package ArraysJava;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+1];
        for (int i=1;i<n+1;i++)
        {
           // array[i] = sc.nextInt();
            System.out.println(array[i]);
        }
       // array[0] = 0;
        for (int i=1;i<n+1;i++){
            System.out.println(i+"th Elment is "+array[i]);
        }
    }
}
