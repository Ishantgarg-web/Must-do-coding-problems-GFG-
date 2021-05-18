class Solution
{
    //Function to convert an infix expression to a postfix expression.
    public static int precedence(Character ch)
    {
        if(ch=='(')
        {
            return 0;
        }
        else if(ch=='+' || ch=='-')
        {
            return 1;
        }
        else if(ch=='*' || ch=='/')
        {
            return 2;
        }
        else if(ch=='^')
        {
            return 3;
        }
        return 4;
    }
	public static String infixToPostfix(String exp) 
	{
		// Your code here
		Stack<Character> st=new Stack<Character>();
		String res="";
		for (int i=0;i<exp.length();i++)
		{
		    if(exp.charAt(i)=='(')
		    {
		        st.push(exp.charAt(i));
		    }
		    else if((exp.charAt(i)>=65 && exp.charAt(i)<=90) || (exp.charAt(i)>=97 && exp.charAt(i)<=122))
		    {
		        res=res+exp.charAt(i);
		    }
		    else if(exp.charAt(i)==')')
		    {
		        while(st.isEmpty()==false && st.peek()!='(')
		        {
		            res=res+st.pop();
		        }
		        if(st.peek()=='('){st.pop();}
		    }
		    else if(st.isEmpty()==true || precedence(exp.charAt(i))>precedence(st.peek()))
		    {
		        st.push(exp.charAt(i));
		    }
		    else if(precedence(exp.charAt(i))<=precedence(st.peek()))
		    {
		        while(st.isEmpty()==false && st.peek()!='(' && precedence(exp.charAt(i))<=precedence(st.peek()))
		        {
		            res=res+st.peek();
		            st.pop();
		        }
		      //  if(st.peek()=='('){st.pop();}
		        st.push(exp.charAt(i));
		    }
		}
		while(st.isEmpty()==false)
		{
		    res=res+st.pop();
		}
		return res;
	} 
}
