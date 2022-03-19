package AssignmentNewtonSchool.MaduloArithmatic;

public class LongFastPower {
    public static void main(String[] args){
        System.out.println(bigFastPower(144,12,1000000007));
    }
    static long bigFastPower(long a,long b,long m){
        long res =1;
       // long m = 1000000007;
        while (b>0){
            if ((b&1) !=0){
                res = (res%m*a%m)%m;
            }
            a = (a%m*a%m)%m;
            b = b>>1;
        }
        return res;
    }
}
