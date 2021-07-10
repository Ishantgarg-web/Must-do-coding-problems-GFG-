class Solution{
    
    // Function to find 
    static int findMissing(int arr[], int size)
    {
       
       // Your code here
       int max=Integer.MIN_VALUE;
       for (int i=0;i<size;i++)
       {
           max=(int)Math.max(max,arr[i]);
       }
       int count[]=new int[max+1];
       for (int i=0;i<size;i++)
       {
           if(arr[i]>=0)
           {
               count[arr[i]]++;
           }
       }
       for (int i=1;i<max+1;i++)
       {
           if(count[i]==0)
           {
               return i;
           }
       }
       return max+1;
    }
}
