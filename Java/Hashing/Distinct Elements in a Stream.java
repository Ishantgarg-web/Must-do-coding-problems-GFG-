class Solution{
    
  
    ArrayList<Integer> maxDistinctNum(int arr[], int n)
    {
        // Complete the function
        ArrayList<Integer> al=new ArrayList<Integer>();
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for (int i=0;i<n;i++)
        {
            if(arr[i]>0)
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
            else
            {
                int x=-1*arr[i];
                if(hm.containsKey(x) && hm.get(x)==1)
                {
                    hm.remove(x);
                }
                else if(hm.containsKey(x))
                {
                    hm.put(x,hm.get(x)-1);
                }
            }
            al.add(hm.size());
        }
        return al;
    }
  
    
}
