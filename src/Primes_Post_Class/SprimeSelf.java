package Primes_Post_Class;

import java.util.Arrays;
import java.util.Scanner;

public class SprimeSelf {
   static boolean[] isPrime = new boolean[10000001];
    public static boolean[] isPrime(int n){

        for (int i=2;i*i<=10000000;i++){
            Arrays.fill(isPrime,true);
            isPrime[0] = false;
            isPrime[1] = false;
            for (int j=2*i;i<10000000;j+=i){
                isPrime[j] = false;
            }

        }

        return isPrime;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       int count = 0;
       int i = n/2+1;
        while (i<=n){
            if (isPrime[i] == true){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
