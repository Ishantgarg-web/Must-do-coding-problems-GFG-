class Solution
{
    //Function to count number of ways to reach the nth stair 
    //when order does not matter.
    Long countWays(int m)
    {
        // your code here
        if(m==1)
        {
            return (long)1;
        }
        if(m==2)
        {
            return (long)2;
        }
        long dp[]=new long[m+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<=m;i++)
        {
            dp[i]=dp[i-2]+1;
        }
        return dp[m];
    }    
}
