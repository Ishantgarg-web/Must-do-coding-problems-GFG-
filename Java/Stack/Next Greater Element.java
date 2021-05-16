class Solution
{
    //Function to find the next greater element for each element of the array.
    public static void swap(long a[],int l,int h)
    {
        long temp=a[l];
        a[l]=a[h];
        a[h]=temp;
    }
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        int low=0,high=n-1;
        while(low<high)
        {
            swap(arr,low,high);
            low++;
            high--;
        }
        Stack<Long> s=new Stack<Long>();
        long ans[]=new long[n];
        s.push(arr[0]);
        for (int i=0;i<n;i++)
        {
            while(s.isEmpty()==false && arr[i]>=s.peek())
            {
                s.pop();
            }
            if(s.isEmpty()==true)
            {
                ans[i]=-1;
            }
            else
            {
                ans[i]=s.peek();
            }
            s.push(arr[i]);
        }
        low=0;high=n-1;
        while(low<high)
        {
            swap(ans,low,high);
            low++;
            high--;
        }
        return ans;
    } 
}
