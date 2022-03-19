package AssignmentNewtonSchool.MaduloArithmatic;

public class IsThePrime {
    static boolean isPrime(int n ){
        boolean prime=false;
        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                prime = true;
            }
        }
        if (!prime){
            //System.out.println("prime");
            return true;
        }
        return false;
    }
    public static int[] primeFactors(int n)
    {
        int arr[] = new int[n];

        for (int i = 0; i <n; i++) {
          //  System.out.print(arr[i]);
            if (n % i == 0) {
               if( isPrime(i)) {
                   arr[i] = i;
                   //System.out.println(arr[i] + "V ");
                  // return arr[i];
               }
            }
        }
        return arr;
    }
    static int f(int x,int p){
        int ans = 1;
        int k =0;
        int powerValue;
        while (k<x/2){
            powerValue = (int) Math.pow(p,k);
           // System.out.println(powerValue);
            if ((x%powerValue)==0){
                ans =  powerValue;

            }
            k++;
        }
        //System.out.println("V"+ans);
       return ans;
    }
    static int g(int x,int y){
        int ans = 1;
        int [] factorOfX = new int[x];
        int g = 1;
        for (int i=0;i<y/2;i++){
          //  factorOfX[i] = primeFactors(x);
            System.out.println(factorOfX[i]);
           g  = g* f(y,factorOfX[i]);
            System.out.println("jay"+g);
        }

        return 0;
    }
    public static void main(String[] args){
        int n =10;
        int x = 2;
       // primeFactors(10);
        System.out.println(primeFactors(140));
       // isPrime(5);
      //  g(10,2);
       // f(70,3);
        System.out.println();
       // isPrime(35);
       // f(5,2);
       // int arr = {2,3,4,5}
        int array[] = new int[14];


    }
}
