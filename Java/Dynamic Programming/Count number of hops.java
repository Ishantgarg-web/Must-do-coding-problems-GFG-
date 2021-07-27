class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        // add your code here
        int m=(int)Math.pow(10,9)+7;
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        if(n==3)
        {
            return 4;
        }
        else
        {
            long dp[]=new long[n+1];
            dp[0]=0;
            dp[1]=1;dp[2]=2;dp[3]=4;
            for (int i=4;i<=n;i++)
            {
                dp[i]=(dp[i-1]%m+dp[i-2]%m+dp[i-3]%m)%m;
            }
            return dp[n];
        }
    }
    
}

