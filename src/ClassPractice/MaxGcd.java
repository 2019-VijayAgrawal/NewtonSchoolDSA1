package ClassPractice;
// JAVA Code for Find pair with maximum GCD in an array
class MaxGcd {

    // function to find GCD of pair with
    // max GCD in the array
    public static int findMaxGCD(int arr[], int n)
    {
        // Computing highest element
        int high = 0;
        for (int i = 0; i < n; i++)
            high = Math.max(high, arr[i]);
        System.out.println("High = "+high);

        // Array to store the count of divisors
        // i.e. Potential GCDs
        int divisors[] =new int[high + 1];
        // Iterating over every element
        for (int i = 0; i < n; i++)
        {
            // Calculating all the divisors
            for (int j = 1; j <= Math.sqrt(arr[i]); j++)
            {
                // Divisor found
                if (arr[i] % j == 0)
                {
                    // Incrementing count for divisor
                    divisors[j]++;

                    // Element/divisor is also a divisor
                    // Checking if both divisors are
                    // not same
                   //   System.out.println();
                    if (j != arr[i] / j)

                        divisors[arr[i] / j]++;
                   System.out.print(divisors[arr[i]/j]);
                }
                System.out.print(" divisor[ "+j+" ]"+" "+divisors[j]+ " "+" d["+arr[i]/j+ "] "+divisors[arr[i]/j]+" ");
               System.out.println();
               // System.out.print("d[ "+arr[i]/j+ "] "+divisors[arr[i]/j]+" ");

            }
        }
           System.out.println();
        // Checking the highest potential GCD
        for (int i = high; i >= 1; i--) {
            System.out.println(i+" th "+divisors[1]);
            // If this divisor can divide at least 2
            // numbers, it is a GCD of at least 1 pair
            if (divisors[i] > 1) {
              //  System.out.println(i);
                return i;
            }
        }
        return 1;
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        // Array in which pair with max GCD
        // is to be found
        int arr[] = { 2, 4, 5, 2, 2 };

        // Size of array
        int n = arr.length;
           findMaxGCD(arr,n);
       // System.out.println(findMaxGCD(arr,n));
    }
}

// This code is contributed by Arnav Kr. Mandal.
