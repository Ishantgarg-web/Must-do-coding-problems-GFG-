// Problem link: https://practice.geeksforgeeks.org/problems/last-index-of-15847/1

class Solution {
    public int lastIndex( String s) {
        for (int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='1')
            {
                return i;
            }
        }
        return -1;
        
    }
}
