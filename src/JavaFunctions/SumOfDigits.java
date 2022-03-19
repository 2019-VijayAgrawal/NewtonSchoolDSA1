package JavaFunctions;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        boolean condition = true;
        Scanner sc = new Scanner(System.in);
        while (condition == true ){
            System.out.println("Do You want to enter a number");
            String truthValue = sc.nextLine();
            if (truthValue.equals("Yes") || truthValue.equals("yes")){
                int num = sc.nextInt();
                int result = sumOfDigits(num);
                System.out.println(result);
                return;
            }
            else if (truthValue.equals("No") || truthValue.equals("no")){
                return;
            }
        }

    }
    public static int sumOfDigits(int n){
        int sum = 0;
        int remainder;
        boolean truthValue = false;
        while(n > 0){
            remainder = n%10;
            sum = sum + remainder;
            n = n/10;
        }
        return sum;
    }

}
