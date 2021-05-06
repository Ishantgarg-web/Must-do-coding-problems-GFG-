class Solution
{
    String modify (String s)
    {
        // your code here
        String vowels="";
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e'
            || s.charAt(i)=='o' || s.charAt(i)=='i'
            || s.charAt(i)=='u')
            {
                vowels=vowels+s.charAt(i);
            }
        }
        int temp=vowels.length()-1;String ans="";
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e'
            || s.charAt(i)=='o' || s.charAt(i)=='i'
            || s.charAt(i)=='u')
            {
                ans=ans+vowels.charAt(temp--);
            }
            else
            {
                ans=ans+s.charAt(i);
            }
        }
        return ans;
    }
}
