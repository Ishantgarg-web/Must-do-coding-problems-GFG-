class Solution {
    public int maxLevelSum(Node root) {
        // add code here.
        if(root==null)
        {
            return 0;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        q.add(null);
        boolean temp=false;
        int max=Integer.MIN_VALUE;
        int sum=0;
        while(q.size()>1)
        {
            Node curr=q.poll();
            if(curr!=null)
            {
                sum=sum+curr.data;
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
                max=(int)Math.max(max,sum);
                sum=0;
                q.add(null);
            }
        }
        return (int)Math.max(max,sum);
    }
}
