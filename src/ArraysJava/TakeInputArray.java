package ArraysJava;

import java.util.Scanner;

public class TakeInputArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = takeInputArray(sc);
        System.out.println("Enter the number that you want to find");

        int numberToFind = sc.nextInt();
        int result = findNum(arr,numberToFind);
        if (result == -1){
            System.out.println("Index not found");
        }
        else {
            System.out.println("The number is found at index: "+result);
        }
    }
    static int[] takeInputArray(Scanner sc){
        System.out.println("Enter the size of array");
      //  Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Please Enter the array number using space");
        int[] array = new int[length];
        for (int i =0;i<length;i++){
            int enterNum = sc.nextInt();
            array[i] = enterNum;
        }
       // sc.close();
        return array;
    }
    static int findNum(int[] arr,int numberToFind){
        for (int i =0;i<arr.length;i++){
            if (arr[i] == numberToFind){
                return i;
            }
        }
        return -1;
    }
}
