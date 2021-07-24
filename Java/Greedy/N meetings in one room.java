class pair
{
    int x,y;
    pair(int a,int b)
    {
        x=a;
        y=b;
    }
}
class Mycmp implements Comparator<pair>
{
    public int compare(pair pa,pair pb)
    {
        return pa.y-pb.y;
    }
}
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        pair p[]=new pair[n];
        for (int i=0;i<n;i++)
        {
            p[i]=new pair(start[i],end[i]);
        }
        Arrays.sort(p, new Mycmp());
        int res=0,count=1;
        for (int i=1;i<n;i++)
        {
            if(p[i].x<=p[res].y)
            {
                continue;
            }
            else
            {
                count++;
                res=i;
            }
        }
        return count;
    }
}

