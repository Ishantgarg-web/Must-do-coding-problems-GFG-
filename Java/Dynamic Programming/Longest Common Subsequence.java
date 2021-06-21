//using Memoziation
class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    //int memo[][]=new int[p][q];
    public static int lcsmake(String s1,String s2,int m,int n,int memo[][])
    {
        if(memo[m][n]!=-1)
        {
            return memo[m][n];
        }
        if(m==0 || n==0)
        {
            return 0;
        }
        else if(s1.charAt(m-1)==s2.charAt(n-1))
        {
            memo[m][n]=1+lcsmake(s1,s2,m-1,n-1,memo);
        }
        else
        {
            memo[m][n]=(int)Math.max(lcsmake(s1,s2,m-1,n,memo),lcsmake(s1,s2,m,n-1,memo));
        }
        return memo[m][n];
    }
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int memo[][]=new int[x+1][y+1];
        for (int i=0;i<=x;i++)
        {
            for (int j=0;j<=y;j++)
            {
                memo[i][j]=-1;
            }
        }
        return lcsmake(s1,s2,x,y,memo);
        
        
    }
    
}
