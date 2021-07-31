class Solution
{
    int max_Books(int arr[], int n, int k)
    {
         // Your code here     
         int res=0,sum=0,max=0;
         for (int i=0;i<n;i++)
         {
             if(arr[i]<=k)
             {
                 sum+=arr[i];
                 //continue;
             }
             else
             {
                 max=(int)Math.max(max,sum);
                 sum=0;
             }
         }
         max=(int)Math.max(max,sum);
         return max;
    }
}
