package AssignmentNewtonSchool.ThirdAssignment;
import java.util.Scanner;
public class First {
    static int sum =0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = {1 ,2 ,3, 2 ,4, 4 ,6 ,6 ,7 ,6};
        //int n = sc.nextInt();
        int n = array.length;
        int[] array1 = new int[n];
        //int n = array.length;

        for (int i=0;i<n;i++){
            sum = sum + array[i];

        }
//        int subs=0;
//        for (int i=1;i<n-1;i++) {
//
//            if (array[i]>array[i+1]){
//                //array[i+1] =  array[i]-array[i+1];
//                subs = subs +array[i] - array[i+1];
//            }
//        }

        array[0] =0;
        System.out.print(array[0]);
        int diff=0;
        for (int i=0;i<n-1;i++){
            if (array[i+1]>=array[i]){
                array[i] = 0;
                System.out.print(array[i]);

            }
            else {
               // System.out.println();
                diff =array[i] - array[i+1];
                System.out.print(diff);
            }
        }

        System.out.println();
        //System.out.println(sum);
        int subs=0;
        int add = 0;
        for (int i=0;i<n;i++) {
           add = add + array[i];

        }
        sum = sum + add;
       // System.out.println(sum);

    }
}
