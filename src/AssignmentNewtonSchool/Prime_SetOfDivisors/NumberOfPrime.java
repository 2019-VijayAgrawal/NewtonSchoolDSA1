package AssignmentNewtonSchool.Prime_SetOfDivisors;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NumberOfPrime {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int R = sc.nextInt();
        boolean[] array = new boolean[n+1];
        for (int i=0;i<=n;i++){
            array[i] = false;
        }
        for (int i=2;i<=n;i++){
            if (array[i] == false){
                for (int j=i+i;j<=n;j+=i){
                    array[j] = true;
                }
            }
        }
        int count=0;
        for (int i=2;i<=n;i++){
            if (array[i]==false){
                array[i] = true;
                count++;
                int [] arrayPrime = new int[count];
                //count++;
                System.out.println(arrayPrime[i]);
            }
        }
        System.out.println(count);
    }

}