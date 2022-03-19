package ArraysJava;
import java.util.Scanner;
public class SearchArray {
    public static void main(String[] arr){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Size Of array");
        int size = sc.nextInt();
        int[] array = new int[5];
        System.out.println("Enter Array Elements:");
        for (int i =0;i<size;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The Array is");
        for (int i = 0;i<size;i++){
            System.out.print(array[i]+" ");
            int enterNum = sc.nextInt();

         }
    }
}
