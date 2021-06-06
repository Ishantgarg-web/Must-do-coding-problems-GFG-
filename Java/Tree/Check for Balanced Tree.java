class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return 1+(int)Math.max(height(root.left),height(root.right));
    }
    boolean isBalanced(Node root)
    {
	// Your code here
	    if(root==null)
	    {
	        return true;
	    }
	    else
	    {
	        int l=height(root.left);
	        int r=height(root.right);
	        if((int)Math.abs(l-r)>1)
	        {
	            return false;
	        }
	        return isBalanced(root.left) && isBalanced(root.right);
	    }
    }
}

