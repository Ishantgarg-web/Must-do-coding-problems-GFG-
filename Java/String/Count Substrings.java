class Solution
{
    int countSubstr (String S)
    {
        // your code here   
        int n=0;
        for (int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='1')
            {
                n++;
            }
        }
        int sum=0;
        for (int i=1;i<n;i++)
        {
            sum=sum+(n-i);
        }
        return sum;
    }
}
