class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> st=new Stack<Integer>();
        for (int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='+')
            {
                int a=st.pop();
                int b=st.pop();
                st.push(b+a);
            }
            else if(S.charAt(i)=='-')
            {
                int a=st.pop();
                int b=st.pop();
                st.push(b-a);
            }
            else if(S.charAt(i)=='*')
            {
                int a=st.pop();
                int b=st.pop();
                st.push(b*a);
            }
            else if(S.charAt(i)=='/')
            {
                int a=st.pop();
                int b=st.pop();
                st.push(b/a);
            }
            else
            {
                st.push(S.charAt(i)-48);
            }
        }
        return st.pop();
    }
}
