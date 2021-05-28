class Solution{
    public static int sumoftree(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return root.data+sumoftree(root.left)+sumoftree(root.right);
    }
    public int tiltTree(Node root){
        //code here
        if(root==null)
        {
            return 0;
        }
        return (int)Math.abs(sumoftree(root.left)-sumoftree(root.right))+tiltTree(root.left)+tiltTree(root.right);
    }
}
