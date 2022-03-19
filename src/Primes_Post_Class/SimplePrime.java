package Primes_Post_Class;

import java.util.Scanner;

public class SimplePrime {
    static boolean isPrime(int n){
        if(n==2)
            return true;
        if (n%2==0)
            return false;
        for (int i=3;i*i<=n;i++){
            if (n%i == 0)
                return false;
            if (i%2==0)
                i++;
            else
                i +=2;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(isPrime(n));
        //int T = sc.nextInt();
       int primearray[] = new int[5001];
       long sumArray[] = new long[5002];
        //primearray[0] = 0;
       for (int i=1;i<=n;i++){
           primearray[i] = sc.nextInt();
       }
       sumArray[0] = 0;
       for (int i=1;i<=n;i++){
           sumArray[i] = primearray[i];
           System.out.println(sumArray);
       }
       int L = sc.nextInt();        int count = 0;

        int R = sc.nextInt();
       // int sumArray[] = new int[50001];
        for (int j=L;j<=R;j++){
            int sum = 0;
            sumArray[j] = j;



        }
    }
}
