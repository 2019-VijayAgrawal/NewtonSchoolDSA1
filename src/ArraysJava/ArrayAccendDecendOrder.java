import java.util.Scanner;
public class ArrayAccendDecendOrder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt(); //size of Array
        System.out.println("The are element are:");
        //initializing array
        int[] array = new int[size];
        //input array Elements
        for (int i=0;i<size;i++){
            array[i] = sc.nextInt();

        }

        System.out.println("Array element are:");
        for (int i=0;i<size;i++){
            //return array[i];
           // int temp[i] = 0;
           // temp[] =
            System.out.println(array[i]);
            //array[i];
        }
    }
}
