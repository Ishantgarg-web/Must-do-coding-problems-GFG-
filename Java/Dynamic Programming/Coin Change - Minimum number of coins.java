class Solution
{
    //Function to find the minimum number of coins to make the change 
    //for value using the coins of given denominations.
    public long minimumNumberOfCoins(int coins[],int n,int val)
    {
        // your code here
        long dp[]=new long[val+1];
        dp[0]=0;
        for (int i=1;i<val+1;i++)
        {
            dp[i]=Integer.MAX_VALUE;
        }
        for (int i=1;i<=val;i++)
        {
            for (int j=0;j<n;j++)
            {
                if(coins[j]<=i)
                {
                    long sub_res=dp[i-coins[j]];
                    if(sub_res!=Integer.MAX_VALUE)
                    {
                        dp[i]=(long)Math.min(dp[i],sub_res+1);
                    }
                }
            }
        }
        if(dp[val]==Integer.MAX_VALUE)
        {
            return -1;
        }
        return dp[val];
    }
}
