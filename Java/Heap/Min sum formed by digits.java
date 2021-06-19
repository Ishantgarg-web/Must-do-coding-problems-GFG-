class Solution {
    
    public static long minSum(int arr[], int n)
    {
        // Your code goes here
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for (int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        long sum1=0,sum2=0;
        boolean temp=true;
        while(pq.isEmpty()==false)
        {
            if(temp)
            {
                sum1=sum1*10+pq.poll();
                temp=false;
            }
            else
            {
                sum2=sum2*10+pq.poll();
                temp=true;
            }
        }
        return sum1+sum2;
    }
}
