//problem link: https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int maxending=arr[0],sum=arr[0];
        for (int i=1;i<n;i++)
        {
            maxending=(int)Math.max(maxending+arr[i],arr[i]);
            sum=(int)Math.max(sum,maxending);
        }
        return sum;
    }
    
}
