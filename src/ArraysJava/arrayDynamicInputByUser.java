//package ArraysJava;
import java.util.Scanner;
public class arrayDynamicInputByUser {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the size of array:");

        n = sc.nextInt();
        int[] array = new int[10] ;//intitialization of array
        System.out.println("Enter element of array");
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();
           // System.out.println("Enter "+i+"  term");

        }
        //System.out.println(" Array Element are:");
         int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int temp =0;
        for (int i=0;i<n;i++){
            if(array[i]<min ){
               // System.out.println(array[i]);
               min = array[i];
            }
            if (array[i]>max){
                max = array[i];
            }

        }
        System.out.println("Smallest number is " +min);
        System.out.println("Greatest number is " +max);

    }
}
