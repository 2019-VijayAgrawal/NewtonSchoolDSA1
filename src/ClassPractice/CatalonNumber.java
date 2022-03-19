package ClassPractice;
import java.util.Scanner;
public class CatalonNumber {
    static long factorial(long n){
        if(n==0 || n==1){
            return 1;
        }
        return (n*factorial(n-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long mod = 1000000007L;
      long  catalonNumber = (factorial(2*n)/((factorial(n+1)%mod*factorial(n)%mod))%mod)%1000000007L;
      long a = factorial(n+1)%mod;
      long b = factorial(n)%mod;
      long c = (a*b)%mod;
      long d = factorial(2*n);
      long e = (d/c)%mod;
        System.out.println(catalonNumber);
        System.out.println("a"+a);
        System.out.println("b"+b);
        System.out.println("c"+c);
        System.out.println("d"+d);
        System.out.println(e);
    }
}
