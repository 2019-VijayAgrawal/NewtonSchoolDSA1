package AssignmentNewtonSchool.GCD.PostClass;

import java.util.Scanner;

public class GCD_PairsContest {
    static int GCD(int a,int b){
        if (a==0)
            return b;
        if (b==0)
            return a;
        if (a==b)
            return a;
        if (a>b)
            return GCD(a-b,b);
        return GCD(a,b-a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+1];
        for (int i=1;i<=n;i++){
            array[i] = sc.nextInt();
        }
        int high = 0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i != j){
                   high = Math.max(high,GCD(array[i],array[j])) ;
                }
            }

        }
        System.out.println(high);
    }
}
