class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int ans[]=new int[V];
        int degree[]=new int[V];
        //ArrayList<Integer> al=new ArrayList<Integer>();
        for (int i=0;i<V;i++)
        {
            for (int j=0;j<adj.get(i).size();j++)
            {
                degree[adj.get(i).get(j)]++;
            }
        }
        /*
        for (int i=0;i<V;i++)
        {
            System.out.print(degree[i]+" ");
        }
        System.out.println();*/
        Queue<Integer> q=new LinkedList<Integer>();
        for (int i=0;i<degree.length;i++)
        {
            if(degree[i]==0)
            {
                q.add(i);
                //break;
            }
        }
        //q.add(0);
        int idx=0;
        while(q.isEmpty()==false)
        {
            int curr=q.poll();
            ans[idx++]=curr;
            for (int u:adj.get(curr))
            {
                degree[u]=degree[u]-1;
                if(degree[u]==0)
                {
                    q.add(u);
                }
            }
        }
        /*
        for (int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        System.out.println();*/
        return ans;
    }
}
