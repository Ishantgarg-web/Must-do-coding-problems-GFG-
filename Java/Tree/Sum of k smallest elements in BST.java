class Tree {
    public static void inorder(Node root,ArrayList<Integer> al)
    {
        if(root!=null)
        {
            inorder(root.left,al);
            al.add(root.data);
            inorder(root.right,al);
        }
    }
    int sum(Node root, int K) { 
        
        // Code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        inorder(root,al);
        int sum=0;
        for (int i=0;i<K;i++)
        {
            sum=sum+al.get(i);
        }
        return sum;
    } 
}
