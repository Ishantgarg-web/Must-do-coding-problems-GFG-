class Solution
{
	int minDepth(Node root)
	{
	    //code here
	    if(root==null){return 0;}
	    Queue<Node> q=new LinkedList<Node>();
	    q.add(root);
	    q.add(null);
	    int res=1;
	    while(q.size()>1)
	    {
	        Node curr=q.poll();
	        if(curr!=null)
	        {
	            if(curr.left==null && curr.right==null)
	            {
	                return res;
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
	            res++;
	            q.add(null);
	        }
	    }
	    return res;
	}
}

