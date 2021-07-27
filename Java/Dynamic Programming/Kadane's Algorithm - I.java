class Solution
{
    //Function to print the maximum contiguous subarray sum ending at each 
    //position in the array and return the overall maximum.
    public long maximumSum(int arr[], int n)
    {
       //code here
       long max=arr[0];
       for (int i=1;i<n;i++)
       {
           //max=(long)Math.max(max,arr[i]+max);
           arr[i]=(int)Math.max(arr[i-1]+arr[i],arr[i]);
       }
       for (int i=0;i<n;i++)
       {
           max=(long)Math.max(max,arr[i]);
           System.out.print(arr[i]+" ");
       }
       System.out.println();
       return max;
    }

}
