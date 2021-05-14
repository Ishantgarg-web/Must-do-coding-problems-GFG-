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
    static Long getPPS(int a, int b) {
        // code here
        long sum=0;
        for (int i=a;i<=b;i++)
        {
            if(isprime(i) && ispalindrome(i))
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static boolean ispalindrome(int n)
    {
        int rev=0;
        int temp=n;
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        if(rev==temp)
        {
            return true;
        }
        return false;
    }
};
