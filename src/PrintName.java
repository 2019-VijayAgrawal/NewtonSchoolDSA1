import java.util.Scanner;

public class PrintName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt() ;
        System.out.println(printName(5));
    }
    static boolean printName(int n){
        System.out.println("Vijay");
         printName(n-1);
        return false;
    }
}
