class Solution
{
    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean visited[]=new boolean[V];
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Queue<Integer> q=new LinkedList<Integer>();
        visited[0]=true;
        q.add(0);
        while(q.isEmpty()==false)
        {
            int u=q.poll();
            ans.add(u);
            for (int v:adj.get(u))
            {
                if(visited[v]==false)
                {
                    q.add(v);
                    visited[v]=true;
                }
            }
        }
        return ans;
    }
}
