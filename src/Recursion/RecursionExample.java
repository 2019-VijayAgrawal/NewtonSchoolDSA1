package Recursion;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class RecursionExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println(fibbonacci(index));

    }
     static int fibbonacci(int index){
        System.out.println("index is:");
        if (index == 0 || index == 1) {
            return index;
        }
        return fibbonacci(index-1)+fibbonacci(index-2);
    }
}
