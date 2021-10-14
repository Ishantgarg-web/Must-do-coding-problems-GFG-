class CheckBit
{
    // Function to check if Kth bit is set or not.
   
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        int x=n>>(k);
        int y=x&1;
        return (y==1)?true:false;
    }
    
}
