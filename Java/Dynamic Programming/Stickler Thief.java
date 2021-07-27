class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        if(n==1)
        {
            return arr[0];
        }
        if(n==2)
        {
            return (int)Math.max(arr[0],arr[1]);
        }
        else
        {
            int dp[]=new int[n+1];
            dp[0]=0;dp[1]=arr[0];dp[2]=(int)Math.max(arr[0],arr[1]);
            for (int i=3;i<=n;i++)
            {
                dp[i]=(int)Math.max(arr[i-1]+dp[i-2],dp[i-1]);
            }
            return dp[n];
        }
    }
}
