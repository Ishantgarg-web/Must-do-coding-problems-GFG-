class Solution
{
    public static int ceilindex(int arr[],int l,int h,int x)
    {
        int ans=0;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(arr[m]>=x)
            {
                ans=m;
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return ans;
    }
	public int minDeletions(int arr[], int n) 
	{ 
	   //code here.
	   int tail[]=new int[n];
	   tail[0]=arr[0];
	   int len=1;
	   for (int i=1;i<n;i++)
	   {
	       if(arr[i]>tail[len-1])
	       {
	           tail[len++]=arr[i];
	       }
	       else
	       {
	           int idx=ceilindex(tail,0,len-1,arr[i]);
	           tail[idx]=arr[i];
	       }
	   }
	   return (n-len);
	} 
}
