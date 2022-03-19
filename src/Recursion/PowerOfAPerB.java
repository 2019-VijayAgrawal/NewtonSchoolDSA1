package Recursion;

public class PowerOfAPerB {
   static int stepCount = 0;
    public static void main(String[] args){
        System.out.println(pow(3,4 ));
       // System.out.println("step "+stepCount);
    }
    static int pow(int a ,int b){
        stepCount++;
        if (b==0){
            return 1;
        }
        return a*pow(a,b-1);
    }
}
