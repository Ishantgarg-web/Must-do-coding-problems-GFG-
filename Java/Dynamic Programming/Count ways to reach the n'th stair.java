class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        
        // your code here
        int m=(int)Math.pow(10,9)+7;
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        else
        {
            int dp[]=new int[n+1];
            dp[0]=0;
            dp[1]=1;
            dp[2]=2;
            for (int i=3;i<=n;i++)
            {
                dp[i]=((dp[i-1]%m+dp[i-2]%m)%m);
            }
            return dp[n];
        }
    }
}

