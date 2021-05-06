class Solution
{
    public String transform(String str)
    {
        // code here
        String ans="";
        for (int i=0;i<str.length();i++)
        {
            if(i==0 || str.charAt(i-1)==' ')
            {
                ans=ans+(char)(str.charAt(i)-32);
            }
            else
            {
                ans=ans+str.charAt(i);
            }
        }
        return ans;
    }
}
