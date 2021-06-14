class Solution
{
    /* Returns level of given data value */
    int getLevel(Node root, int data)  
    { 
        // Write your code here
        if(root==null)
        {
            return 0;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        q.add(null);
        int lvl=0;
        while(q.size()>1)
        {
            Node curr=q.poll();
            if(curr!=null)
            {
                if(curr.data==data)
                {
                    return lvl+1;
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
                lvl++;
                q.add(null);
            }
        }
        return 0;
    } 

}
