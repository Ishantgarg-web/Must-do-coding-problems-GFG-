// problem link: https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1


class Solution {
    public static void swap(ArrayList<Integer> arr,int a,int b)
    {
        int temp=arr.get(a);
        arr.set(a,arr.get(b));
        arr.set(b,temp);
    }
    public static void reverse(ArrayList<Integer> arr,int low,int high)
    {
        while(low<high)
        {
            swap(arr,low,high);
            low++;
            high--;
        }
    }
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int i=0;
        while(i<n)
        {
            if(i+k-1<n)
            {
                reverse(arr,i,i+k-1);
            }
            else
            {
                reverse(arr,i,n-1);
            }
            //reverse(arr,i,i+k-1);
            i=i+k;
        }
    }
}
