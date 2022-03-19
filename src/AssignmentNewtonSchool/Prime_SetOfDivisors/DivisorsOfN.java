package AssignmentNewtonSchool.Prime_SetOfDivisors;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DivisorOfN {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
         //t=1;
        int count = 0;
        for (int i =1;i<=t;i++) {
            int n = sc.nextInt();
            for(int j=1;j<=Math.sqrt(n);j++){

                    if (n % j == 0) {
                         if (n/j == j){
                             count++;
                         }
                         if((n/j)%j==0){
                             count++;
                         }


                }
            }
            System.out.println(count);
        }

    }
}