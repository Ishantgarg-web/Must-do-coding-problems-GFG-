class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    public static void swap(int matrix[][],int e1,int e2,int l1,int l2)
    {
        int temp=matrix[e1][e2];
        matrix[e1][e2]=matrix[l1][l2];
        matrix[l1][l2]=temp;
    }
    public static void transpose(int matrix[][],int n)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                swap(matrix,i,j,j,i);
            }
        }
    }
    static void rotateby90(int matrix[][], int n) 
    { 
        // code here
        transpose(matrix,n);
        
        for (int i=0;i<n/2;i++)
        {
            for (int j=0;j<n;j++)
            {
                swap(matrix,i,j,(n-1)-i,j);
            }
        }
        
    }
}
