//problem link: https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1#

class Solution {
    public static boolean fun(int a[],int s)
    {
        for (int i=0;i<a.length;i++)
        {
            if(a[i]==s)
            {
                return true;
            }
        }
        return false;
    }
    int countTriplet(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int i=0,j=n-2,count=0;
        while(i<n-2)
        {
            if(fun(arr,arr[i]+arr[j])==true)
            {
                count++;
                j--;
            }
            else
            {
                j--;
            }
            if(i==j)
            {
                i++;
                j=n-2;
            }
        }
        return count;
        //return 
    }
}
