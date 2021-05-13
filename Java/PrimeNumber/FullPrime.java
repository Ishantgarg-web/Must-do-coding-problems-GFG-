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
	static int fullPrime(int n){
	    //code here
	    if(isprime(n))
	    {
	        while(n>0)
	        {
	            if(isprime(n%10)==false)
	            {
	                return 0;
	            }
	            n=n/10;
	        }
	        return 1;
	    }
	    return 0;
	}
}
