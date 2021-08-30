class GfG{
    public static void sortedinsert(Stack<Integer> s,int temp)
    {
        if(s.size()==0)
        {
            s.push(temp);
        }
        else if(temp>=s.peek())
        {
            s.push(temp);
        }
        else
        {
            int x=s.pop();
            sortedinsert(s,temp);
            s.push(x);
        }
    }
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(s.size()>1)
		{
		    int temp=s.pop();
		    s=sort(s);
		    sortedinsert(s,temp);
		}
		return s;
	}
}
