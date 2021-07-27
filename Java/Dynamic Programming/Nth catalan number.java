class Solution
{
    //Function to find the nth catalan number.
    public static BigInteger findCatalan(int n)
    {
        //Your code here
        if(n==1)
        {
            return BigInteger.ONE;
        }
        else if(n==2)
        {
            return BigInteger.TWO;
        }
        BigInteger dp[]=new BigInteger[n+1];
        dp[0]=BigInteger.ONE;
        dp[1]=BigInteger.ONE;
        dp[2]=BigInteger.TWO;
        for (int i=2;i<=n;i++)
        {
            BigInteger sum=BigInteger.ZERO;
            for (int j=1;j<=i;j++)
            {
                sum=sum.add(dp[j-1].multiply(dp[i-j]));
            }
            dp[i]=sum;
        }
        return dp[n];
    }
}
