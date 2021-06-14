class Solution{
    int max=0,min=Integer.MAX_VALUE;
    public int findMax(Node root){
        //code here
        if(root==null)
        {
            return max;
        }
        if(root.data>max)
        {
            max=root.data;
        }
        int x=findMax(root.left);
        int y=findMax(root.right);
        return (int)Math.max(x,y);
    }
    public int findMin(Node root){
        //code here
        if(root==null)
        {
            return min;
        }
        if(root.data<min)
        {
            min=root.data;
        }
        int x=findMin(root.left);
        int y=findMin(root.right);
        return (int)Math.min(x,y);
    }
}
