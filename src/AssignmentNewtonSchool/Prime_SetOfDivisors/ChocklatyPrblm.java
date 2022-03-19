package AssignmentNewtonSchool.Prime_SetOfDivisors;
import java.util.Scanner;
public class ChocklatyPrblm {
    static boolean isPrime(int n,int i){
        if(n == 2){
            return true;
        }
        if(n % 2 == 0){
            return false;
        }
        for( i = 3; i*i <= n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        while(!isPrime(n,2)){
            if(n%2==0){
                n=n+1;
            }
            else{
                n=n+2;
            }
        }
        System.out.println(n-temp);
    }
}
