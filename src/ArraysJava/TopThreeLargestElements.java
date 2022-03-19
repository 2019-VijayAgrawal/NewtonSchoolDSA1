package ArraysJava;

import java.util.Scanner;

public class TopThreeLargestElements {

    public static void topThreeElements(int [] arrA){



        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i <arrA.length ; i++) {
            int current = arrA[i];
            if(first<current){
                third = second;
                second = first;
                first = current;
            }else if(second<current){
                third = second;
                second = current;
            }else if(third<current){
                third=current;
            }
        }
        System.out.println("top three elements are: " + first + " " + second + " " + third);
    }
static int minSizeArray;
    public static void main(String[] args) {
        //int [] arrA = new int [] {  1, 10};
        Scanner sc = new Scanner(System.in);
        // int arr[] = {2,5,8,7,9};
        System.out.println("Enter The min size of Array");
        minSizeArray = sc.nextInt();
        System.out.println("Enter The Size Of First Array");
        int size = sc.nextInt();
        int[] array = new int[size];
        if(array.length<minSizeArray){
            System.out.println("Invalid Input, array size is less than 3");
        }
        for (int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        topThreeElements(array);
    }
}