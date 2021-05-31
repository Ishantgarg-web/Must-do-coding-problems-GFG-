class Tree
{
    // Return the level (0-indexed) with maximum number of nodes.
    public static int maxNodeLevel(Node root)
    {
        // add your code here
        if(root==null)
        {
            return 0;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(q.size()-1);
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
            }
            else
            {
                al.add(q.size());
                q.add(null);
            }
        }
        //al.add(q.size());
        int max=0;
        int level=0;
        for (int i=0;i<al.size();i++)
        {
            if(al.get(i)>max)
            {
                level=i;
                max=al.get(i);
            }
        }
        return level;
    }
}
