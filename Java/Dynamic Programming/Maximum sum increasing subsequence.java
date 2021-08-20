class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    int lis[]=new int[n];
	    lis[0]=arr[0];
	    for (int i=1;i<n;i++)
	    {
	        lis[i]=arr[i];
	        for (int j=0;j<i;j++)
	        {
	            if(arr[j]<arr[i]){lis[i]=(int)Math.max(lis[i],lis[j]+arr[i]);}
	        }
	    }
	    int res=0;
	    for (int i=0;i<n;i++)
	    {
	        res=(int)Math.max(res,lis[i]);
	    }
	    return res;
	}  
}
