class Solution
{
 
    // arr: input array
    // n: size of array
    //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.
    static void arrange(long arr[], int n)
    {
        // your code here
        long temp[]=new long[n];
        for (int i=0;i<n;i++)
        {
            temp[i]=arr[(int)arr[i]];
        }
        for (int i=0;i<n;i++)
        {
            arr[i]=temp[i];
        }
    }
}
