class Solution {
    public static boolean isprime(long n)
    {
        if(n==1){return false;}
        if(n==2 || n==3){return true;}
        for (int i=5;i*i<=n;i=i+6)
        {
            if(n%i==0 || n%(i+2)==0)
            {
                return false;
            }
        }
        return true;
    }
    static long isAmazing(long n){
        // code here
        if(n==1 || n==3 ||n==7){return 0;}
        if(n%2==0)
        {
            if(n==4)
            {
                return 1;
            }
            return 0;
        }
        else
        {
            if(isprime(n))
            {
                return 0;
            }
            for (long i=3;i*i<n;i++)
            {
                if(n%i==0)
                {
                    return 0;
                }
            }
            return 1;
        }
    }
}
