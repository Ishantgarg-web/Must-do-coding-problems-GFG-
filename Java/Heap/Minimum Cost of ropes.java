class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        //ArrayList<Long> al=new ArrayList<Long>();
        long sum=0;
        PriorityQueue<Long> pq=new PriorityQueue<Long>();
        for (int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        while(pq.size()>1)
        {
            long a=pq.poll();
            long b=pq.poll();
            sum=sum+a+b;
            pq.add(a+b);
        }
        return sum;
    }
}
