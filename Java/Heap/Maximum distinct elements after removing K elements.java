class Solution{
    
  
    int maxDistinctNum(int a[], int n, int K)
    {
        // Complete the function
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        int max=0;
        for (int i=0;i<n;i++)
        {
            max=(int)Math.max(max,a[i]);
        }
        int hash[]=new int[max+1];
        for (int i=0;i<n;i++)
        {
            hash[a[i]]++;
        }
        for (int i=0;i<hash.length;i++)
        {
            if(hash[i]!=0)
            {
                pq.add(hash[i]);
            }
        }
        while(K-->0)
        {
            int curr=pq.poll();
            if(curr-1!=0){
            pq.add(curr-1);}
        }
        return pq.size();
    }
    
}
