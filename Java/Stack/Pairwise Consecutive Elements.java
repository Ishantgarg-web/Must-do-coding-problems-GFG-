class GFG
{
    public static boolean pairWiseConsecutive(Stack<Integer> st)
    {
        // Your code here
       int n=st.size();
       if(n%2!=0)
       {
           st.pop();
       }
       while(st.isEmpty()==false)
       {
           int a=st.pop();
           int b=st.pop();
           if((int)Math.abs(a-b)!=1)
           {
               return false;
           }
       }
       return true;
	}
}
