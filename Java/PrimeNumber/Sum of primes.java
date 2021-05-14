class Solution{
    public static boolean isprime(int n)
    {
        if(n==1)
        {
            return false;
        }
        if(n==2 || n==3)
        {
            return true;
        }
        if(n%2==0 || n%3==0)
        {
            return false;
        }
        for (int i=5;i*i<=n;i=i+6)
        {
            if(n%i==0 || n%(i+2)==0)
            {
                return false;
            }
        }
        return true;
    }
    static int primeSum(int n){
        // code here
        int count=0;
        while(n>0)
        {
            if(isprime(n%10))
            {
                count=count+n%10;
            }
            n=n/10;
        }
        return count;
    }
}
