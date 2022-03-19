package AssignmentNewtonSchool.MaduloArithmatic;
import java.io.*;
import java.util.Scanner;

class ModuloInverse {

    // A naive method to find modulor
    // multiplicative inverse of 'a'
    // under modulo 'm'
    static long modInverse( long m)
    {
        long mod = 1000000007;
        for (int x = 1; x < m; x++)
            if (m*x % mod == 1)
                return x;
        return m;
    }
    static int calmodInv(int a, int b)
    {
        a = a % b;
        for (int x = 1; x < b; x++)
            if ((a * x) % b == 1)
                return x;
        return 1;
    }
    static long factorial(long n){
        if (n==0 || n==1)
            return 1;
        return n*factorial(n-1);
    }
    // Driver Code
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
       // int a = 3, m = 11;
        long m = 1000000007;
        long res = factorial(2*n);
        long den = (factorial(n+1)%m  * factorial(n)%m)%m;

        res = (calmodInv((int) den, (int) m));

        // Function call
        System.out.println(res);
    }

}
