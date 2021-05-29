class Solution
{
	int getLevelDiff(Node root)
	{
	    //code here
	    if(root==null)
	    {
	        return 0;
	    }
	    Queue<Node> q=new LinkedList<Node>();
	    q.add(root);
	    q.add(null);
	    int sumodd=0;
	    int sumeven=0;
	    boolean temp=false;
	    while(q.size()>1)
	    {
	        Node curr=q.poll();
	        if(curr!=null)
	        {
	            if(temp==false)
	            {
	                sumodd=sumodd+curr.data;
	            }
	            else
	            {
	                sumeven=sumeven+curr.data;
	            }
	            if(curr.left!=null)
	            {
	                q.add(curr.left);
	            }
	            if(curr.right!=null)
	            {
	                q.add(curr.right);
	            }
	        }
	        else
	        {
	            q.add(null);
	            if(temp==false)
	            {
	                temp=true;
	            }
	            else
	            {
	                temp=false;
	            }
	        }
	    }
	    return sumodd-sumeven;
	}
}
