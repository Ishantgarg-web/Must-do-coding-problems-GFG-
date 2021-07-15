class Solution{
    static int isPossible(int n, int arr[], int K)
    {
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
        for (Map.Entry<Integer,Integer> entry:hm.entrySet())
        {
            if(2*K<entry.getValue())
            {
                return 0;
            }
        }
        return 1;
    }
}
