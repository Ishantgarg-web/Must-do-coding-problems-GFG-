class GFG
{
    public static boolean isprime(long n)
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
    long minNumber(long arr[], int N)
    {
        long sum=0;
        for (int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        long temp=sum;
        while(isprime(sum)!=true)
        {
            sum++;
        }
        return (sum-temp);
    }
}
