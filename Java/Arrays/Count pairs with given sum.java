class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for (int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        int ans=0;
        for (int i=0;i<n;i++)
        {
            if(hm.containsKey(k-arr[i]))
            {
                if(k-arr[i]==arr[i])
                {
                    ans+=hm.get(arr[i])-1;
                }
                else{
                ans+=hm.get(k-arr[i]);}
            }
        }
        return ans/2;
    }
}
