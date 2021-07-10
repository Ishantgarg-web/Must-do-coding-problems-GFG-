class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        if(m==0 || n==0)
        {
            return 0;
        }
        else if(m>n)
        {
            return -1;
        }
        Collections.sort(a);
        long min=Integer.MAX_VALUE;
        for (long i=0;i+m-1<n;i++)
        {
            min=Math.min(a.get((int)(i+m-1))-a.get((int)(i)),min);
        }
        return min;
    }
}
