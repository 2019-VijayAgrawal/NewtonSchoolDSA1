package ArraysJava;
import java.util.Scanner;
import java.util.Arrays;
public class MaxDiffTwoElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        //int min = array[0];
        for (int i=0;i<n;i++){
                Arrays.sort(array);

        }
        //System.out.println(Arrays.toString(array));
        Arrays.toString(array);
        int diff = array[4]-array[0];
        System.out.println(diff);

    }
}
