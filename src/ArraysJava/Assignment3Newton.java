import java.util.Scanner;
public class Assignment3Newton {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       //int[] array = new int[5];
      // array = sc.nextInt();
        //System.out.println("Enetr a");
        for (int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.print("NewtonSchool " );
            }
            else if (i%5==0){
                System.out.print("School ");
            }
            else if (i%3==0){
                System.out.print("Newton ");
            }
            else {
                System.out.print( i +" " );
            }
        }

    }
}
