package AssignmentNewtonSchool.ThirdAssignment;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaxDiffArray {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(maxIndexDiff(array,n));

    }
    static int maxIndexDiff(int[] arr,int n){
        int LMin[] = new int[n];
        int RMax[] = new int[n];
        LMin[0] = arr[0];
        for(int i=1;i<n;++i){
            LMin[i] = Math.min(arr[i],LMin[i-1]);

        }
        RMax[n-1] = arr[n-1];
        for(int j=n-2;j>=0;--j){
            RMax[j] = Math.max(arr[j], RMax[j+1]);
        }
        int i=0;
        int j=0;
        int maxDiff = -1;
        while(j<n && i<n){
            if(LMin[i] < RMax[j]){
                maxDiff = Math.max(maxDiff,j-i);
                j= j+1;
            }
            else{
                i = i+1;
            }

        }
        return maxDiff;
    }
}
