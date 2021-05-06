class Solution {
    int isPlaindrome(String S) {
        // code here
        int n=S.length();
        int low=0,high=n-1;
        while(low<high)
        {
            if(S.charAt(low)!=S.charAt(high))
            {
                return 0;
            }
            else
            {
                low++;
                high--;
            }
        }
        return 1;
    }
};
