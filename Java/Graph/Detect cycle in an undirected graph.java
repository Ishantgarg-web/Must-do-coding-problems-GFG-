class Solution
{
    //Function to detect cycle in an undirected graph.
    public static boolean DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[],int parent)
    {
        visited[s]=true;
        for (int u:adj.get(s))
        {
            if(visited[u]==false)
            {
                if(DFSrec(adj,u,visited,s)==true)
                {
                    return true;
                }
            }
            else if(u!=parent)
            {
                return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean visited[]=new boolean[V];
        for (int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                if(DFSrec(adj,i,visited,-1)==true)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
