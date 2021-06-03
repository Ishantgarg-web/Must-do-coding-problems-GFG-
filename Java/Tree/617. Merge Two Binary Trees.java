//problem link: https://leetcode.com/problems/merge-two-binary-trees/

class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null){return null;}
        else if(root1==null && root2!=null){return root2;}
        else if(root1!=null && root2==null){return root1;}
        else
        {
            root1.val=root1.val+root2.val;
            root1.left=mergeTrees(root1.left,root2.left);
            root1.right=mergeTrees(root1.right,root2.right);
            return root1;
        }
    }
}
