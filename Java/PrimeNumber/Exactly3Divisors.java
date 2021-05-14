class Solution
{
    public static boolean isprime(int n)
    {
        if(n==1){return false;}
        if(n==2 || n==3){return true;}
        if(n%2==0 || n%3==0){return false;}
        for (int i=5;i*i<=n;i=i+6)
        {
            if(n%i==0 || n%(i+2)==0)
            {
                return false;
            }
        }
        return true;
    }
    public int exactly3Divisors(int n)
    {
        //Your code here
        if(n<=3){return 0;}
        int res=2,ans=0;
        while(res*res<=n)
        {
            if(isprime(res))
            {
                ans++;
            }
            res++;
        }
        return ans;
    }
}
