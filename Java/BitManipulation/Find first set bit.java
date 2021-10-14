class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        if(n==0){return 0;}
            int ans=0;
            int y=n&1;
            while(y!=1)
            {
                ans++;
                n=n>>1; 
                y=n&1;      
            }
            return (ans+1);
    }
}
