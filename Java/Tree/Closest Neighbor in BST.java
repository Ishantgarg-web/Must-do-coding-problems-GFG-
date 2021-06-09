class Tree
{
    static int ans=0;
    public static int findMaxForN(Node node, int val)
    {
    //Add your code here.
        if(node==null)
        {
            return ans;
        }
        if(node.key==val)
        {
            return val;
        }
        else if(node.key>val)
        {
            return findMaxForN(node.left,val);
        }
        else
        {
            ans=node.key;
            return findMaxForN(node.right,val);
        }
        //return ans;
    }
}
