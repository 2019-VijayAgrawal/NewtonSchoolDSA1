import java.util.Scanner;
public class Assigment2Percentage {
    public static void main(String[] args){
        int a,b,c,d;
        int sum = 0;
        int percentage = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        sum = a + b + c + d;
        percentage = sum*100/400;
        System.out.println(percentage);
    }
}
