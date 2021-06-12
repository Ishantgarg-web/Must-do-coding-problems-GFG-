class Solution {
    boolean areMirror(Node a, Node b) {
        // Your code here
        if(a==null && b==null){return true;}
        if((a.left==null && a.right==null) && (b.left==null && b.right==null))
        {
            if(a.data==b.data)
            {
                return true;
            }
            return false;
        }
        else if(a==null && b!=null){return false;}
        else if(a!=null && b==null){return false;}
        else if(a.data==b.data)
        {
            return areMirror(a.left,b.right) && areMirror(a.right,b.left);
        }
        return false;
    }
}
