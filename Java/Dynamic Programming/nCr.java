class Solution
{
    //Function to return nCr mod 10^9+7 for given n and r.
    public static int nCrModp(int n, int r)
    {
        // your code here
        if(r>n)
        {
            return 0;
        }
        int m=(int)Math.pow(10,9)+7;
        int dp[][]=new int[n+1][r+1];
        for (int i=0;i<=r;i++)
        {
            dp[0][i]=0;
        }
        for (int i=0;i<=n;i++)
        {
            dp[i][0]=1;
        }
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=r;j++)
            {
                dp[i][j]=((dp[i-1][j-1]%m)+(dp[i-1][j]%m))%m;
            }
        }
        return dp[n][r];
    }
}


