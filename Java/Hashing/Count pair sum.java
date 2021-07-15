class Solution
{ 
  
    // function to count all pairs  
    // from both the sorted arrays  
    // whose sum is equal to a given  
    // value 
    static int countPairs(int arr1[],int arr2[], int M, int N, int x) 
    { 
        //code here.
        HashSet<Integer> h1=new HashSet<Integer>();
        HashSet<Integer> h2=new HashSet<Integer>();
        for (int i=0;i<M;i++)
        {
            h1.add(arr1[i]);
        }
        for (int i=0;i<N;i++)
        {
            h2.add(arr2[i]);
        }
        int count=0;
        for (int i=0;i<M;i++)
        {
            if(h2.contains(x-arr1[i]))
            {
                count++;
            }
        }
        return count;
    }
}
