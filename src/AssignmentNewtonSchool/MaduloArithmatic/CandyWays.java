package AssignmentNewtonSchool.MaduloArithmatic;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CandyWays {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int moduloInverse(int n,int m){
        n = n%m;
        for(int i=1;i<=m;i++){
            if((n*i)%m == 1){
                return i;
            }
        }
        return -1;
    }
    static int modInverse(int a, int m)
    {

        for (int x = 1; x < m; x++)
            if (((a%m) * (x%m)) % m == 1)
                return x;
        return 1;
    }
    static int biNomial(int n,int r){
        int res =1;
        if (r>n-r){
            r = n - r;
        }
        for (int i=0;i<r;i++){
            res*=(n-i);
            res /=(i+1);
        }
        return res;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
      // System.out.println( biNomial(4,2));
       // int m = 1000000007;
        int cn=0;
        //int  res = factorial(n);
        int  res = factorial(n);
      //  System.out.println(res);
        for(int i=1;i<=n;i++){
            if (i != a && i != b){

//                int res2 = factorial(n-i)*factorial(i);
//              //  System.out.println(res2);
//                int ans = moduloInverse(res,res2);
                int ans = biNomial(n,i);

                cn = cn + ans;

            }
        }
        System.out.println(cn);
    }
}