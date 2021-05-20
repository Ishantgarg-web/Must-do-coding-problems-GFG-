class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> st=new Stack<Integer>();
        while(q.isEmpty()==false)
        {
            st.push(q.poll());
        }
        Queue<Integer> ans=new LinkedList<Integer>();
        while(st.isEmpty()==false)
        {
            ans.offer(st.pop());
        }
        return ans;
    }
}
