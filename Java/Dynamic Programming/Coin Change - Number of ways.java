class Solution
{
    //Function to find out the number of ways to use the coins to
    //sum up to a certain required value.
    public long numberOfWays(int coins[],int n,int val)
    {
        if(val==0){return 1;}
        long dp[][]=new long[val+1][n+1];
        for (int i=0;i<=val;i++)
        {
            dp[i][0]=0;
        }
        for (int i=0;i<=n;i++)
        {
            dp[0][i]=1;
        }
        for (int i=1;i<=val;i++)
        {
            for (int j=1;j<=n;j++)
            {
                dp[i][j]=dp[i][j-1];
                if(coins[j-1]<=i)
                {
                    dp[i][j]+=dp[i-coins[j-1]][j];
                }
            }
        }
        return dp[val][n];
    }
}
