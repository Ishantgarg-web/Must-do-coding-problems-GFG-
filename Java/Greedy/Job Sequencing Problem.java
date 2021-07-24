class Mycmp implements Comparator<Job>
{
    public int compare(Job j1,Job j2)
    {
        return j2.profit-j1.profit;
    }
}
class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        int max=0;
        for (int i=0;i<n;i++)
        {
            max=(int)Math.max(max,arr[i].deadline);
            arr[i].deadline=arr[i].deadline-1;
        }
        Arrays.sort(arr, new Mycmp());
        int check[]=new int[max];
        Arrays.fill(check,0);
        for (int i=0;i<n;i++)
        {
            int x=arr[i].deadline;
            while(x>0 && check[x]!=0)
            {
                x--;
            }
            if(check[x]==0){check[x]=arr[i].profit;}
        }
        int sum=0,count=0;
        int ans[]=new int[2];
        for (int i=0;i<max;i++)
        {
            if(check[i]!=0)
            {
                count++;
                sum+=check[i];
            }
        }
        ans[0]=count;
        ans[1]=sum;
        return ans;
    }
}
