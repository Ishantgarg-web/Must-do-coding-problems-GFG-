class Solution
{
    //Function to return the lowest common ancestor in a Binary Tree.
	Node lca(Node root, int n1,int n2)
	{
		// Your code here
		if(root==null)
		{
		    return null;
		}
		if(root.data==n1 || root.data==n2)
		{
		    return root;
		}
		Node left_lca=lca(root.left,n1,n2);
		Node right_lca=lca(root.right,n1,n2);
		if(left_lca!=null && right_lca!=null)
		{
		    return root;
		}
		if(left_lca!=null){return left_lca;}
		if(right_lca!=null){return right_lca;}
		return null;
	}
}

