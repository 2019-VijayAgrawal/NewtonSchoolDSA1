package AssignmentNewtonSchool.Assignment5;

import java.util.Scanner;

public class SuperExponentation {
    static long fastPower(long a,long b,long m){
        long res = 1;
        while (b>0){
            if ((b&1)!=0){
                res = (res%m * a%m)%m;
            }
            a = (a%m *a%m)%m;
            b= b>>1;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long m = 1000000007;
            long res1 = fastPower(b,c,m-1);
            long res = fastPower(a,res1,m);
            System.out.println(res);
        }
    }



}
