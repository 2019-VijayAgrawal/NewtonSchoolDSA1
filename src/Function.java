import  java.util.Scanner;
public class Function {
    public static void main(String[] args){
       System.out.println("Enter Number");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         printSum(n);

    }
    //Sum Of All Odd number from 1 to n.
    public static void printSum(int n){
        int sum=0;
        for (int i=0;i<=n;i++){
            if (i%2!=0){
                sum = sum + i;
               // System.out.println(i);

            }
        }
       System.out.println(sum);
    }

}
