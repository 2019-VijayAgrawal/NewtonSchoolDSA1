import java.util.Scanner;
public class greaterNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
      //  greateNumber(a,b);
        System.out.println(greateNumber(a,b));

    }
    public static int greateNumber(int a,int b){
        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }

}
