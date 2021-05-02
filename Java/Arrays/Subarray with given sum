class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        int currsum=arr[0],res=0;
        if(currsum==s)
        {
            al.add(1);
            al.add(1);
            return al;
        }
        for (int i=1;i<n;i++)
        {
            currsum=currsum+arr[i];
            while(currsum>s && res<i)
            {
                currsum=currsum-arr[res++];
            }
            if(currsum==s)
            {
                al.add(res+1);
                al.add(i+1);
                return al;
            }
        }
        al.add(-1);
        return al;
    }
}
