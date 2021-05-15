class Solution {
    public static boolean isprime(int n)
    {
        if(n<=1){return false;}
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
    static String damonPrime(int n){
        // code here
        //check if (n-1) and (n+1) prime or not
        if(isprime(n-1) && isprime(n+1))
        {
            return "Yes";
        }
        return "No";
    }
}
