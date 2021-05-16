class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String s)
    {
        // add your code here
        Stack<Character> st=new Stack<Character>();
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{'
            || s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                if(s.charAt(i)==')')
                {
                    if(st.pop()!='('){return false;}
                }
                if(s.charAt(i)=='}')
                {
                    if(st.pop()!='{'){return false;}
                }
                if(s.charAt(i)==']')
                {
                    if(st.pop()!='['){return false;}
                }
            }
        }
        return st.isEmpty(); //check if there are more number of closing brackets than opening brackets. e.g. "((())"
    }
}
