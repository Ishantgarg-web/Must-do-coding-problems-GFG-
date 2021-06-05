// problem link: https://leetcode.com/problems/deepest-leaves-sum/

class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);
        int sum=0,ans=0;
        while(q.size()>1)
        {
            TreeNode curr=q.poll();
            if(curr!=null)
            {
                sum=sum+curr.val;
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
                ans=sum;
                sum=0;
                q.add(null);
            }
        }
        ans=sum;
        return ans;
    }
}
