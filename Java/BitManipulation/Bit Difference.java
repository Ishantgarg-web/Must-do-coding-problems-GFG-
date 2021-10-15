class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int y=a^b;
        int ans=0;
        while(y!=0)
        {
            if((y&1)==1)
            {
                ans++;
            }
            y=y>>1;
        }
        return ans;
    }
    
    
}
