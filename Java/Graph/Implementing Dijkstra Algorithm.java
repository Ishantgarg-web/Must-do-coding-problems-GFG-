class pair
{
    int v,weight;
    pair(int v,int weight)
    {
        this.v=v;
        this.weight=weight;
    }
    public int getV()
    {
        return v;
    }
    public int getweight()
    {
        return weight;
    }
}
class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        int ans[]=new int[V];
        int dist[]=new int[V];
        for (int i=0;i<V;i++)
        {
            if(i==S)
            {
                dist[i]=0;
            }
            else
            {
                dist[i]=Integer.MAX_VALUE;
            }
        }
        boolean fin[]=new boolean[V];
        Arrays.fill(fin,false);
        //fin[S]=true;
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->a.weight-b.weight);
        pq.add(new pair(S,0));
        ans[S]=0;
        while(pq.isEmpty()==false)
        {
            pair p=pq.poll();
            int u=p.getV();
            fin[u]=true;
            for (ArrayList<Integer> ls:adj.get(u))
            {
                int v=ls.get(0);
                int weight=ls.get(1);
                if(dist[v]>dist[u]+weight)
                {
                    dist[v]=dist[u]+weight;
                    pq.add(new pair(v,dist[v]));
                }
            }
        }
        return dist;
    }
}

