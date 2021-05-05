// Problem link: https://practice.geeksforgeeks.org/problems/unsorted-array4925/1#

class Compute {
    public int findElement(int arr[], int n){
        int lmax[]=new int[n];
        lmax[0]=arr[0];
        for (int i=1;i<n;i++)
        {
            lmax[i]=(int)Math.max(lmax[i-1],arr[i]);
        }
        int rmin[]=new int[n];
        rmin[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--)
        {
            rmin[i]=(int)Math.min(rmin[i+1],arr[i]);
        }
        for (int i=1;i<n-1;i++)
        {
            if(arr[i]>=lmax[i] && arr[i]<=rmin[i])
            {
                return arr[i];
            }
        }
        return -1;
    }
}
