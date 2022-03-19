package AssignmentNewtonSchool.ThirdAssignment;
import java.util.Scanner;
public class ThirdAssig {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
       // maxIndexDiff(array,n);
        System.out.println(maxIndexDiff(array,n));
    }
    static int maxIndexDiff(int[] array,int n){
        int i=0;
        int j = n-1;
        int maxDiff = -1;
        while (i<n){

            if (array[j]>array[i] && Math.max(j,i)<(j-i)){
             maxDiff = j-i;
            }
            //System.out.print(array[i]);
            i++;
        }
        return maxDiff;
    }
}
