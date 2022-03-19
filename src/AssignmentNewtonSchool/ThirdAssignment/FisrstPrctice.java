package AssignmentNewtonSchool.ThirdAssignment;
import java.util.Scanner;
public class FisrstPrctice {
    static int sum =0;
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] array = new int[n];
       int[] array2 = new int[n];
       for (int i=0;i<n;i++){
           array[i] = sc.nextInt();
       }
        int diff=0;
        for (int i=0;i<n;i++){
            if (i<1){
                array2[0] = 0;
                System.out.print(0);
            }
            else {
                if (array[i-1]<=array[i]){
                    array2[i] = 0;
                    System.out.print(" "+array2[i]+" ");
                }
                else {
                    diff =array[i-1] - array[i];
                    array2[i] = diff;
                    System.out.print(array2[i]+" ");
                    array[i] = array[i]+diff;
                }
            }
        }
        //System.out.println("Second Array is");
        int sum =0;
        for (int i =0;i<n;i++){
            //System.out.print(array[i]);
            sum = sum + array[i];

        }
        System.out.println();
        System.out.print(sum);
    }
}
