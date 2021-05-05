class Solution
{
    int maxDistance(int arr[], int n)
    {
	// Your code here
	    int max=arr[0];
	    for (int i=1;i<n;i++)
	    {
	        max=(int)Math.max(max,arr[i]);
	    }
	    int low[]=new int[max+1];
	    int high[]=new int[max+1];
	    Arrays.fill(low,-1);
	    Arrays.fill(high,-1);
	    for (int i=0;i<n;i++)
	    {
	        if(low[arr[i]]==-1)
	        {
	            low[arr[i]]=i;
	        }
	        else
	        {
	            high[arr[i]]=i;
	        }
	    }
	    int ans=0;
	    for (int i=0;i<max+1;i++)
	    {
	        ans=(int)Math.max(ans,high[i]-low[i]);
	    }
	    return ans;
    }
}
