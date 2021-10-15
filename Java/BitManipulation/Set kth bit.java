class Solution{
    static int setKthBit(int n,int k){
        // code here
        int ans=0,c=0,temp=0;
        //int y=n&1;
        while(n!=0)
        {
            if(k==0)
            {
                ans+=(int)Math.pow(2,c);
                c++;
                n=n>>1;
            }
            else
            {
                if((n&1)==1)
                {
                    ans+=(int)Math.pow(2,c);
                }
                c++;
                n=n>>1;
            }
            k--;
        }
        return ans;
    }
}
