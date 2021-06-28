class Solution
{
    //Function to sort the array using bubble sort algorithm.
    public static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        for (int i=0;i<n-1;i++)
        {
            for (int j=1;j<=n-1-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    swap(arr,j-1,j);
                }
            }
        }
    }
}
