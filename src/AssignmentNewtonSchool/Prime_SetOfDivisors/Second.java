package AssignmentNewtonSchool.Prime_SetOfDivisors;
import java.util.Scanner;
public class Second {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        for (int i =1;i<=t;i++){
            long n = sc.nextLong();
            long count = 0;

            for(long j=1;j<=Math.sqrt(n);j++){
                if (n%j == 0) {
                    if(j%2 == 0){
                        count++;
                    }
                    if((n/j)%2 == 0){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
