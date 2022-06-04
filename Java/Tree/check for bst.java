
Problem Link: https://practice.geeksforgeeks.org/problems/check-for-bst/1/?page=1&category[]=Tree&sortBy=submissions#

public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    public static boolean fun(Node root,int min,int max){
        if(root==null) return true;
        if(root.data>min && root.data<max)
        {
            return fun(root.left,min,root.data) && fun(root.right,root.data,max);
        }
        return false;
    }
    boolean isBST(Node root)
    {
        // code here.
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        return fun(root,min,max);
    }
}
