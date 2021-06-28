class Solution{
    //Function to find minimum difference between any pair of elements in an array.
    public static int MinimumDifference(int arr[], int n)
    {
        // code here
        Arrays.sort(arr);
        int min=arr[1]-arr[0];
        for (int i=2;i<n;i++)
        {
            min=(int)Math.min(min,arr[i]-arr[i-1]);
        }
        return min;
    }
};
