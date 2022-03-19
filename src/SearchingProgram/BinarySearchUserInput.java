package SearchingProgram;

import ArraysJava.SearchArray;

import java.util.Scanner;

public class BinarySearchUserInput {
    int binarySearch(int arr[],int lower,int upper,int search){
        if(upper>=lower){
            int mid = lower + (upper-1)/2;
            if (arr[mid] == search){
                return mid;
            }
            if (arr[mid]<search){
                return binarySearch(arr,mid+1,upper,search);
            }
            else {
                return binarySearch(arr,lower,mid-1,search);
            }
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[10];

        System.out.println("Enter Array Elements:-");
        for (int i =0;i<size;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter Search Element:");
        int seach = sc.nextInt();
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearch(array,0,size-1,seach);
        if (result == -1){
            System.out.println("Element not Found in the Array");
        }
        System.out.println("Elemt founded " + "at Index " +result);

    }
}
