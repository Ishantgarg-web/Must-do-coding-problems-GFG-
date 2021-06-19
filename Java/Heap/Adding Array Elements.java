class Solution {
    int minOperations(int[] arr, int n, int k) {
        // code here
        int sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for (int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        boolean temp=true;
        while(temp)
        {
            if(pq.peek()<k)
            {
                pq.add(pq.poll()+pq.poll());
                sum++;
            }
            else
            {
                temp=false;
            }
        }
        return sum;
    }
}
