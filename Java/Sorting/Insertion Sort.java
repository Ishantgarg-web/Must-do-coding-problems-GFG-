class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
       int key=arr[i];
       int j=i-1;
       while(j>=0 && arr[j]>key)
       {
           arr[j+1]=arr[j];
           j--;
       }
       arr[j+1]=key;
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for (int i=1;i<n;i++)
      {
          insert(arr,i);
      }
  }
}
