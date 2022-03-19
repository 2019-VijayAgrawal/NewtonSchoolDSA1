package SearchingProgram;
import java.util.Scanner;
public class SearchNumFromArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size Of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Element of Array");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number that you want to Search");
        int search = sc.nextInt();
        for (int i=0;i<arr.length;i++){
            if (search == arr[i]){
                System.out.println("index is "+i);
            }

        }
        System.out.println("The no is not present in the array");

    }
}
