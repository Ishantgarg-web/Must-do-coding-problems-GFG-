class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int min=i;
        for (int j=i+1;j<arr.length;j++)
        {
            if(arr[j]<arr[min])
            {
                min=j;
            }
        }
        return min;
	}
	public static void swap(int a[],int i,int j)
	{
	    int temp=a[i];
	    a[i]=a[j];
	    a[j]=temp;
	}
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for (int i=0;i<n;i++)
	    {
	        int x=select(arr,i);
	        swap(arr,i,x);
	    }
	}
}
