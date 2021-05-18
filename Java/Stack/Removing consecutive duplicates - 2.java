

class Solution
{
    //Function to remove pair of duplicates from given string using Stack.
    public static String removePair(String str)
    {
        // your code here
        String ans="";
        Stack<Character> st=new Stack<Character>();
        for (int i=0;i<str.length();i++)
        {
            if(st.isEmpty()==true)
            {
                st.push(str.charAt(i));
            }
            else if(str.charAt(i)==st.peek())
            {
                st.pop();
            }
            else
            {
                st.push(str.charAt(i));
            }
        }
        while(st.isEmpty()==false)
        {
            ans=ans+st.pop();
        }
        StringBuilder sb=new StringBuilder(ans);
        sb.reverse();
        return sb.toString();
    }
}
