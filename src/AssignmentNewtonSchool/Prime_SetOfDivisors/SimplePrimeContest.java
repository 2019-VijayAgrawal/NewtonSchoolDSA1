package AssignmentNewtonSchool.Prime_SetOfDivisors;

import java.util.Scanner;

public class SimplePrimeContest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i=3;i<n/2;i++){
            if (n%i!=0){
              count++;
            }
            System.out.println(count);
        }

//        int L = sc.nextInt();
//        int R = sc.nextInt();
//        int i=L;
//        while (i<=R){
//
//            i++;
//        }
    }
}
