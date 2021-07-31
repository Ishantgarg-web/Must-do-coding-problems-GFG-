class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
        int max=0,idx=0;
        for (int i=0;i<N;i++)
        {
            int sum=0;
            for (int j=0;j<N;j++)
            {
                if(arr[j][i]==0)
                {
                    sum++;
                }
            }
            if(sum>max)
            {
                idx=i;
                max=sum;
            }
        }
        return idx;
    }
}
