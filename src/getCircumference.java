import java.util.Scanner;
public class getCircumference {
    public static double getCircumference(int radious){
        double circumFerence = 0;
        circumFerence = 2*3.14*radious;
        return circumFerence;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int radious;
        radious = sc.nextInt();
        System.out.println(getCircumference(radious));
    }
}
