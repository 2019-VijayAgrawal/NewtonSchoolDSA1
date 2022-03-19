package Recursion;
import java.util.Scanner;
public class TowerOfHanoi {
    public static void towerOfHanoi(int n ,String source,String helper,String disk)
    {
        if(n==1)
        {
            System.out.println( "Transfer Disk " +n+ " from " +source+ " to "+disk);
            return;
        }
        towerOfHanoi(n-1,helper,source,disk);
    }
    public static void main(String[] args){
        int n = 3;
        towerOfHanoi(n,"S","H","D");
    }
}
