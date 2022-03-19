package AssignmentNewtonSchool.ThirdAssignment;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Donation {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int totalDonation=0;
        int currentDonation=0;
        int totalExtraDonation=0;
        for(int i=0;i<n;i++)
        {
            if(currentDonation<a[i])
            {
                currentDonation=a[i];}
            int extraDonation=currentDonation-a[i];
            System.out.print(extraDonation+" ");
            //totalExtraDonation=totalExtraDonation+extraDonation;
            totalDonation=totalDonation+currentDonation+totalExtraDonation;
        }
        System.out.println();
        System.out.print(totalDonation);
    }
}
