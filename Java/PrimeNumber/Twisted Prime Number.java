class Solution {
    public static boolean isprime(int n)
    {
        if(n==1){return false;}
        for (int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static int rev(int n)
    {
        int rev1=0;
        while(n>0)
        {
            rev1=rev1*10+n%10;
            n=n/10;
        }
        return rev1;
    }
    int isTwistedPrime(int n) {
        // code here
        if (isprime(n) && isprime(rev(n)))
        {
            return 1;
        }
        return 0;
    }
}
