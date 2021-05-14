class Solution
{
    public static boolean isprime(int n)
    {
        if(n==1){return true;}
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
    public static int leastprime(int n)
    {
        if(n==1){return 1;}
        if(n==2 || n==3){return n;}
        if(n%2==0){return 2;}
        if(n%3==0){return 3;}
        for (int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return i;
            }
        }
        return 0;
    }
    public int[] leastPrimeFactor(int n)
    {
        // code here
        int ans[]=new int[n+1];
        for (int i=1;i<=n;i++)
        {
            if(isprime(i))
            {
                ans[i]=i;
            }
            else{ans[i]=leastprime(i);}
        }
        return ans;
    }
}
