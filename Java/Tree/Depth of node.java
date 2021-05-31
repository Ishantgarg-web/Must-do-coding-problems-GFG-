class Solution{
    public static int depthOfOddLeaf(Node root)
    {
        //code here
        if(root==null)
        {
            return 0;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        q.add(null);
        boolean odd=true;
        int ans=0,level=0;
        while(q.size()>1)
        {
            Node curr=q.poll();
            if(curr!=null)
            {
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
                if(odd)
                {
                    if(curr.left==null && curr.right==null)
                    {
                        ans=level+1;
                    }
                }
            }
            else
            {
                q.add(null);
                level++;
                if(odd==true)
                {
                    odd=false;
                }
                else
                {
                    odd=true;
                }
            }
        }
        return ans;
    }
}
