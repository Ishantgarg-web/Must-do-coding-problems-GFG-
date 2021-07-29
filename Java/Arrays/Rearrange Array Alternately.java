class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(int arr[], int n){
        
        // Your code here
        int maxi=n-1;
        int mini=0;
        int max=arr[n-1]+1;
        for (int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                arr[i]+=(arr[maxi]%max)*max;
                maxi--;
            }
            else
            {
                arr[i]+=(arr[mini]%max)*max;
                mini++;
            }
        }
        for (int i=0;i<n;i++)
        {
            arr[i]=arr[i]/max;
        }
    }
    
}


