class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> al=new ArrayList<Integer>();
        int top=0,left=0,right=c-1,bottom=r-1;
        if(top==bottom)
        {
            for (int i=0;i<c;i++)
            {
                al.add(matrix[0][i]);
            }
            return al;
        }
        while(top<=bottom && left<=right)
        {
            for (int i=left;i<=right;i++)
            {
                al.add(matrix[top][i]);
            }
            top++;
            for (int i=top;i<=bottom;i++)
            {
                al.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for (int i=right;i>=left;i--)
            {
                al.add(matrix[bottom][i]);
            }
            bottom--;}
            if(left<=right){
            for (int i=bottom;i>=top;i--)
            {
                al.add(matrix[i][left]);
            }
            left++;}
        }
        return al;
    }
}
