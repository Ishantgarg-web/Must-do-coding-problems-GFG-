class Solution {
    int isPanagram(String S) {
        // code here
        S=S.toLowerCase();
        int count[]=new int[256];
        for (int i=0;i<S.length();i++)
        {
            count[S.charAt(i)]++;
            
            
        }
        int sum=0;
        for (int i=97;i<=122;i++)
        {
            if(count[i]==0)
            {
                return 0;
            }
        }
        return 1;
    }
};
