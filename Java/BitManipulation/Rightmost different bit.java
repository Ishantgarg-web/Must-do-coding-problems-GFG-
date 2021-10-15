class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here    
        // x= 0010
            int x=m^n;
            int ans=0;
            int y=x&1;
            while(x!=0 && y!=1)
            {
                x=x>>1;
                y=x&1;
                ans++;
            }
            return ans+1;
    }
}


