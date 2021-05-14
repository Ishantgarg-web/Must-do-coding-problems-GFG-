class Solution {
    static int hasThreePrimeFac(Long n) {
        // code here
        
        if(n==1 || n==3 || n==7){return 0;}
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
            int count=0;
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
};
