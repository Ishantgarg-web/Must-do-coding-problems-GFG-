// problem link: https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1#

class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n==1)
        {
            return (int)(1);
        }
        long sum=0;
        for (int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        long maxend=arr[0];
        for (int i=1;i<n;i++)
        {
            maxend=(long)Math.max(maxend+arr[i],arr[i]);
            if(maxend-arr[i]==sum-maxend)
            {
                return (int)(i+1);
            }
        }
        return -1;
    }
}
