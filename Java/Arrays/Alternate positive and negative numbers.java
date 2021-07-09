class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> pos=new ArrayList<Integer>();
        ArrayList<Integer> neg=new ArrayList<Integer>();
        for (int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                pos.add(arr[i]);
            }
            else
            {
                neg.add(arr[i]);
            }
        }
        int res1=0,res2=0;
        boolean flag=true;
        if(pos.size()==0){flag=false;}
        for (int i=0;i<n;i++)
        {
            if(flag)
            {
                arr[i]=pos.get(res1);
                res1++;
                if(res2!=neg.size()){flag=false;}
            }
            else
            {
                arr[i]=neg.get(res2);
                res2++;
                if(res1!=pos.size()){flag=true;}
            }
        }
    }
}
