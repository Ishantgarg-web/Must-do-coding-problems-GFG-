class Solution
{
    //Function to find transpose of a matrix
    public static void swap(int matrix[][],int e1,int e2,int l1,int l2)
    {
        int ele1=matrix[e1][e2];
        int ele2=matrix[l1][l2];
        int temp=matrix[e1][e2];
        matrix[e1][e2]=matrix[l1][l2];
        matrix[l1][l2]=temp;
    }
    static void transpose(int matrix[][], int n)
    {
        // code here
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                swap(matrix,i,j,j,i);
            }
        }
    }
}
