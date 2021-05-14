class Solution{
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
    public static int sumofdigits(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
	int digitPrime(int n){
	    //code here
		while(n%10!=n)
		{
		    n=sumofdigits(n);
		}
		if(isprime(n))
		{
		    return 1;
		}
		return 0;
	}
}
