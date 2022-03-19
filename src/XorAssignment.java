public class XorAssignment {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int l = a.length;
        int[] a1 = new int[l+1];
        for (int i=0;i<l+1;i++){
            int j=i+1;
            a1[0] = 0;
            a1[j] = a[i];
            System.out.print(a[j]);

        }
    }
}
