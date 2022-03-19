package AssignmentNewtonSchool.ThirdAssignment;
import java.util.Scanner;
public class Second {
    static int minSizeArray;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i=0;i<testCases;i++){
            int size = sc.nextInt();
            int[] array = new int[size];
            for(int j=0;j<size;j++){
                array[j] = sc.nextInt();
            }
            findTheeMax(array);
        }
    }
    public static void findTheeMax(int[] arr){
         int firstMax = Integer.MIN_VALUE;
         int secondMax = Integer.MIN_VALUE;
         int thirdMax = Integer.MIN_VALUE;
         for (int i=0;i<arr.length;i++){
             int current = arr[i];
             if (firstMax<current){
                 thirdMax = secondMax;
                 secondMax = firstMax;
                 firstMax = current;
             }
             else if (secondMax<current){
                 thirdMax = secondMax;
                 secondMax = current;
             }
             else if (thirdMax<current){
                 thirdMax = current;
             }
         }
        System.out.println("top three elements are: " + firstMax + " " + secondMax + " " + thirdMax);
    }

}
