import java.util.Scanner;

public class PairEmUpContest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        //int j ;
        // int i;
        for (int i = 0; i < (n-1); i++) {
            for (int j = (i + 1); j < n/2; j++) {
                max = Math.max(max,array[i]+array[j]);
                if (array[i] + array[j] == max) {
                    System.out.println("Pair with a given sum " + max +
                            " is (" + array[i] + ", " + array[j] + ")");
                }
                }
            }
        System.out.println(max);
       // System.out.println(array[i],array[j]);
    }
}
