// Problem link: https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1#

class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int arr[], int n) { 
        
        // Your code here
        int lmax[]=new int[n];
        int rmax[]=new int[n];
        lmax[0]=arr[0];
        for (int i=1;i<n;i++)
        {
            lmax[i]=(int)Math.max(lmax[i-1],arr[i]);
        }
        rmax[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--)
        {
            rmax[i]=(int)Math.max(rmax[i+1],arr[i]);
        }
        int sum=0;
        for (int i=0;i<n;i++)
        {
            sum=sum+(int)Math.min(lmax[i],rmax[i])-arr[i];
        }
        return sum;
    } 
}


