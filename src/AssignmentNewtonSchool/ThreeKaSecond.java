package AssignmentNewtonSchool;
import java.util.Scanner;
public class ThreeKaSecond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The max value size of output");
        int maxValue = sc.nextInt();

        System.out.print("Enter the the size of first array:  ");
        int n = sc.nextInt();
        int[] arr = new int[100];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();

        }
         // System.out.print(arr[i]);
        System.out.println("Enter the size of second array");
        int m = sc.nextInt();
        for (int i =0;i<m;i++){
            arr[i] = sc.nextInt();
           // System.out.println(arr[i]);
        }
        System.out.println("Enter the size of Third array");
        int o = sc.nextInt();
        for (int i =0;i<o;i++){
            arr[i] = sc.nextInt();
        }
       int max1=0;
      int max2=0;
       int max3 =0;
        for (int i =0;i<n;i++){

           max1 = arr[n-1];
          max2 = arr[n-2];
          max3 = arr[n-3];

        }
        System.out.println(max1+" "+max2+" "+max3 );
       int max4 =0;
       int max5 =0;
       int max6 = 0;
        for (int i=0;i<m;i++){
            max4 = arr[m-1];
            max5 = arr[m-2];
            max6 = arr[m-3];
        }
        System.out.println(max4+" "+max5+" "+max6 );
       int max7=0;
       int max8=0;
        int max9=0;
        for (int i=0;i<o;i++){
            max7 = arr[o-1];
            max8 = arr[o-2];
            max9 = arr[o-3];
        }
        System.out.println(max7+" "+max8+" "+max9 );
        sc.close();
    }
}
