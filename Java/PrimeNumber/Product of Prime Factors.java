class Solution{
    static long primeProduct(int n) 
    { 
        // code here
        if(n<=3)
        {
            return n;
        }
        long res=1;
        for (int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                res=res*i;
                n=n/i;
            }
            while(n%i==0)
            {
                n=n/i;
            }
        }
        if(n>1){res=res*n;} //Checking for prime numbers
        return res;
    }
}
