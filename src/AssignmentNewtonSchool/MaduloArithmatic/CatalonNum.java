package AssignmentNewtonSchool.MaduloArithmatic;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CatalonNum {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            long n = sc.nextLong();
            long m = 1000000007;
           // long res = (factorial(2*n)) ;
           // long deno = ((factorial(n+1))%m * (factorial(n)%m))%m;
            long result = ((factorial(2*n)) * (moduloInverse((factorial(n+1)*factorial(n)),m))) %m;
           // result = result%m;
            System.out.println(result);
        }
    }
    static long moduloInverse(long n,long m) {
        n = n % m;
        for (long i = 1; i < m; i++)
            if ((n * i) % m == 1)
                return i;
        return -1;
    }
    static long factorial(long n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
