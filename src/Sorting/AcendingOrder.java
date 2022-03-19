package Sorting;
import java.util.Scanner;
public class AcendingOrder {
    static int count=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of fiest Array");
        int size1 = sc.nextInt();
        int[] array = new int[size1];
        arrayInput(array,sc);
        System.out.println("Step Count is :"+count);
        System.out.println("Enter the size of Second Array");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        arrayInput(array,sc);
        System.out.println("Enter the size of Third  Array");
        int size3 = sc.nextInt();
        int[] array3 = new int[size3];
        arrayInput(array,sc);

     //s  int[] arr = {2,3,1,5,6};

       System.out.println("Sorted Element is");
         sorting(array);
         sorting(array2);
         sorting(array3);
        System.out.println();
         System.out.println("The max 3 no is");
       findFirstThreeMax(array);
       findFirstThreeMax(array2);
       findFirstThreeMax(array3);
    }
       static void arrayInput(int[] arr,Scanner sc){
        for (int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arr);
       }
    private static void findFirstThreeMax(int[] array) {
        int max1 =0;
        int max2 = 0;
        int max3 = 0;
        for (int i = 0;i<array.length;i++){
            max1 = array[0];
            max2 = array[1];
            max3 = array[2];

        }
        System.out.println(max1+ " " +max2+ " " +max3);
    }

    public static void sorting(int[] array){
        int temp = 0;
        for (int i=0;i<array.length;i++){
            for (int j = i+1;j< array.length;j++){
                if (array[i]<array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    count++;
                }
            }
            System.out.print(" "+array[i]);
        }
    }
}
