class Solution
{
    //Function to find sum of all possible substrings of the given string.
    public static long sumSubstrings(String s)
    {
    //Your code her
        int n=s.length();
        int m=(int)Math.pow(10,9)+7;
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=(s.charAt(i)-48);
        }
        if(n==1)
        {
            return (long)arr[0];
        }
        long dp[]=new long[n];
        dp[0]=arr[0];
        for (int i=1;i<n;i++)
        {
            long x=((arr[i]%m)*(i+1))%m;
            dp[i]=(x+(10*(dp[i-1]%m)))%m;
        }
        long sum=0;
        for (int i=0;i<n;i++)
        {
            sum=(sum%m+(dp[i]%m))%m;
        }
        return sum;
    }
}
