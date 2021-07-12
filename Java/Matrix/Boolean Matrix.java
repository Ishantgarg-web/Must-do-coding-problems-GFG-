class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
        //ArrayList<Integer> alr=new ArrayList<Integer>();
        //ArrayList<Integer> alc=new ArrayList<Integer>();
        int r=matrix.length,c=matrix[0].length;
        int al1[]=new int[r];
        int al2[]=new int[c];
        Arrays.fill(al1,0);
        Arrays.fill(al2,0);
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                if(matrix[i][j]==1)
                {
                    al1[i]=1;
                    al2[j]=1;
                }
            }
        }
        for (int i=0;i<r;i++)
        {
            if(al1[i]==1)
            {
                for (int j=0;j<c;j++)
                {
                    matrix[i][j]=1;
                }
            }
        }
        for (int i=0;i<c;i++)
        {
            if(al2[i]==1)
            {
                for (int j=0;j<r;j++)
                {
                    matrix[j][i]=1;
                }
            }
        }
        
    }
}
