// Problem link: https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1#

class Solution {
    public static void swap(int a[],int l,int h)
    {
        int temp=a[l];
        a[l]=a[h];
        a[h]=temp;
    }
    void zigZag(int arr[], int n) {
        // code here
        for (int i=1;i<n-1;i++)
        {
            if(i%2!=0)
            {
                if(arr[i]<arr[i-1])
                {
                    swap(arr,i,i-1);
                }
                if(arr[i]<arr[i+1])
                {
                    swap(arr,i,i+1);
                }
            }
            else
            {
                if(arr[i]>arr[i-1])
                {
                    swap(arr,i,i-1);
                }
                if(arr[i]>arr[i+1])
                {
                    swap(arr,i,i+1);
                }
            }
        }
    }

}
