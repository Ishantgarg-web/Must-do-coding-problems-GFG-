class Solution
{
    //Function to return the maximum sum without adding adjacent elements.
    public long maximumSum(int arr[], int n)
    {
      //Your code here
       long dp[]=new long[n+1];
      if(n==1)
      {
          return arr[0];
          
      }
      if(n==2)
      {
          return (long)Math.max(arr[0],arr[1]);
      }
        else
        {
            dp[0]=0;
            dp[1]=arr[0];
            dp[2]=(long)Math.max(arr[0],arr[1]);
            for (int i=3;i<=n;i++)
            {
                dp[i]=(long)Math.max(((long)Math.max(dp[i-2]+arr[i-1],dp[i-1])),arr[i-1]);
            }
        }
        return dp[n];
    }

}
