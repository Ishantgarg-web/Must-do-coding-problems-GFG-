class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        float y=(float)(Math.log(n)/Math.log(2));
        //System.out.println(y);
       return ((long)y==y)?true:false;
        
    }
    
}
