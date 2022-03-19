package AssignmentNewtonSchool.MaduloArithmatic;

import java.util.Scanner;

public class DeadlyExponentiation {
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long m = 1000000007;
        long res = (long) Math.pow(c,d);
        //System.out.println(res);
        long res2 = fastPower(b, res,m-1);
        //System.out.println(res2);
        long res3 = fastPower(a, (int) res2,m);
        System.out.println(res3);
    }
    static long fastPower(long a,long b,long m){
        long res = 1;
        while (b>0){
            if ((b&1)!=0){
                res = (res * a)%m;
            }
            a = (a * a)%m;
            b= b>>1;
        }
        return res;
    }

}
