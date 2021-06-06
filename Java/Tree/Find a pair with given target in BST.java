class Solution
{
    // root : the root Node of the given BST
    // target : the target sum
    public static void inorder(Node root, ArrayList<Integer> al)
    {
        if(root!=null)
        {
            inorder(root.left,al);
            al.add(root.data);
            inorder(root.right,al);
        }
    }
    public int isPairPresent(Node root, int target)
    {
        // Write your code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        inorder(root,al);
        int n=al.size();
        int i=0,j=n-1;
        while(i<j)
        {
            if(al.get(i)+al.get(j)==target)
            {
                return 1;
            }
            else if(al.get(i)+al.get(j)<target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return 0;
    }
}
