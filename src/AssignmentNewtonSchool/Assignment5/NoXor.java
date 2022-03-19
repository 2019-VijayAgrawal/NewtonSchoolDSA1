package AssignmentNewtonSchool.Assignment5;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NoXor {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextLong();
        }
        long count=0;
        long temp = 0;
        for(int i=1;i<=n;i++){
            temp= (n-i)^array[i-1];
            count += temp;
        }

        System.out.println(count);

    }
}