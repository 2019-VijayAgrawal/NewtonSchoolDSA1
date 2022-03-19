package AssignmentNewtonSchool;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ThirdC {
    int maxIndexDiff(int arr[], int n){
        int maxDiff = -1;
        int i,j;
        for (i=0;i<n;i++){
            for (j=n-1;j>i;j--){
                if (arr[j]>arr[i] && maxDiff <(j-i)){
                    maxDiff = j-i;
                }
            }
        }
        return maxDiff;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of Array");
        int size = Integer.parseInt(br.readLine());
        int[] array = new int[size];
        for (int i=0;i<size;i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        ThirdC max = new ThirdC();
        int maxdiff = max.maxIndexDiff(array,size);
       System.out.println(maxdiff);
    }
}
