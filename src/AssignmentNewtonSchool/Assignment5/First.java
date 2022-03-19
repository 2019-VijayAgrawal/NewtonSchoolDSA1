package AssignmentNewtonSchool.Assignment5;
import java.util.Scanner;
public class First {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        for (int i=1;i<=n-1;i++){
            array1[i] = sc.nextInt();
        }
        int diff=0;
        for (int i=1;i<=n-1;i++){
            diff = diff + array1[i];
        }
        int sum =0;
        for (int j= 1;j<=n;j++){
          // System.out.print(j);
           sum = sum + j;

        }
        //System.out.println(sum);
        diff = sum - diff;
       System.out.println(diff);
    }
}
