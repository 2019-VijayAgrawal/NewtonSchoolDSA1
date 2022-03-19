package AssignmentNewtonSchool.MaduloArithmatic;

import java.util.Scanner;

public class CatalonNumber {

        // A recursive function to find nth catalan number

       static int catalan(int n)
        {
            int res = 0;

            // Base case
            if (n <= 1)
            {
                return 1;
            }
            for (int i = 0; i < n; i++)
            {
                res += catalan(i)
                        * catalan(n - i - 1);
            }
            return res;
        }

        // Driver Code

    public static void main(String[] args){
        long m =1000000007;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <=n; i++)
        {
            res = catalan(n)%1000000007;

        }
        System.out.print(res+" ");
    }

    static int modInverse(int a, int m)
    {

        for (int x = 1; x < m; x++)
            if (((a%m) * (x%m)) % m == 1)
                return x;
        return 1;
    }
    static long factorial(long n){
        if (n==0 || n==1)
            return 1;
        return n*factorial(n-1);
    }
}
