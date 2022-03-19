package Sorting;
import java.util.Scanner;
public class SortingMaxThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of next array");
        int size;
        size = sc.nextInt();
        int[] array = new int[size];
       inputArray(array,sc);

System.out.println("Enter the size of next array");
       int size2;
       size2 = sc.nextInt();
       int[] array2 = new int[size2];
       inputArray(array2,sc);
        System.out.println("Enter the size of next array");
       int size3;
       size3 = sc.nextInt();
       int[] array3 = new int[size3];
       inputArray(array3,sc);

       printOutputArray(array);
       printOutputArray(array2);
       printOutputArray(array3);

    }
    static void inputArray(int[] array,Scanner sc){
        int temp =0;
        for (int i =0;i<array.length;i++){

            array[i] = sc.nextInt();
            //System.out.println(array[i]);

        }
        // System.out.println("The array elements are:");

        for (int i =0;i< array.length;i++){

            for (int j=i+1;j<array.length;j++){

                if (array[i]<array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }

            }
        }


    }
    static void printOutputArray(int[] arr){
        System.out.println();
        System.out.println("sorted areray are:");

        for (int i = 0;i<3;i++){
            System.out.print(arr[i]+" ");

        }
    }
}
