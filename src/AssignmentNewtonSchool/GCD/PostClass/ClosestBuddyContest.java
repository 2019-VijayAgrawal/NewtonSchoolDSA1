package AssignmentNewtonSchool.GCD.PostClass;

import java.util.Scanner;

public class ClosestBuddyContest {
    static int GCD(int a,int b){
        if(a==0)
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
        int min = 100;
         int j;
        for (int i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if (GCD(array[i],array[j] ) == 1){
                min =    Math.min( min,Math.abs(i-j));

                }


            }
            System.out.println(j);
        }



    }
}
