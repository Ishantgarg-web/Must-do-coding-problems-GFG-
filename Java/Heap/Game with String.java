class Solution{
    static int minValue(String s, int k){
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        int count[]=new int[256];
        for (int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }
        for (int i=0;i<256;i++)
        {
            if(count[i]!=0)
            {
                pq.add(count[i]);
            }
        }
        while(k-->0)
        {
            int curr=pq.poll();
            pq.add(--curr);
        }
        int ans=0;
        while(pq.isEmpty()==false)
        {
            ans=ans+(int)Math.pow(pq.poll(),2);
        }
        return ans;
    }
}
