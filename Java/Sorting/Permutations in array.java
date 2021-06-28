class Solution {
    public static void swap(long arr[],int i,int j)
    {
        long temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(long arr[])
    {
        for (int i=0;i<arr.length/2;i++)
        {
            swap(arr,i,arr.length-1-i);
        }
    }
    public boolean isPossible(long a[], long b[], long n, long k) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        reverse(b);
        for (int i=0;i<n;i++)
        {
            if(a[i]+b[i]<k)
            {
                return false;
            }
        }
        return true;
    }
}
