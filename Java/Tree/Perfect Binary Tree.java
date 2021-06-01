class Solution{
    public static boolean isPerfect(Node root){
        //code here
        Queue<Node> q=new LinkedList<Node>();
        if(root==null)
        {
            return true;
        }
        q.add(root);
        q.add(null);
        boolean temp=false;
        while(q.size()>1)
        {
            Node curr=q.poll();
            if(curr!=null)
            {
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                else
                {
                    temp=true;
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
                else
                {
                    temp=true;
                }
            }
            else
            {
                if(q.size()>=1 && temp)
                {
                    return false;
                }
                else
                {
                    q.add(null);
                    
                }
            }
        }
        return true;
    }
}
