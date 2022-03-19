package AssignmentNewtonSchool.MaduloArithmatic;

import java.util.Scanner;

public class TribonacciNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long m =  1000000007;

        long[] T = new long[n+1];
        T[0] = 0;
        T[1] = a;
        T[2] = b;
        T[3] = c;
        for(int i=4;i<=n;i++){
            T[i] = ((T[i-1] %m )+ (T[i-2] %m) +(T[i-3]%m))%m;
        }
        long res = T[n] ;
        System.out.print(res);

    }
}
