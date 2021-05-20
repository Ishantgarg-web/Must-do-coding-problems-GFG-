class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here	
	    while(q1.isEmpty()==false)
	    {
	        q2.offer(q1.poll());
	    }
	    q1.offer(a);
	    while(q2.isEmpty()==false)
	    {
	        q1.offer(q2.poll());
	    }
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    if(q1.size()==0)
	    {
	        return -1;
	    }
	    return q1.poll();
    }
	
}

