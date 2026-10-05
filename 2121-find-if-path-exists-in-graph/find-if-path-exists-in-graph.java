class Solution {
    void DFS(int idx,List<List<Integer>> list, int visited[])
    {
        if(visited[idx]==1)
            return;
        
        visited[idx]=1;
        List<Integer> l=list.get(idx);
        for(int x=0;x<l.size();x++)
        {
            int neighbour=l.get(x);
            DFS(neighbour,list,visited);
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> list=new ArrayList<>();
        for(int x=0;x<n;x++)
        {
            list.add(new ArrayList<>());
        }
        for(int x=0;x<edges.length;x++)
        {
            int a=edges[x][0];
            int b=edges[x][1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        int visited[]=new int[n];
        Arrays.fill(visited,0);
        DFS(source,list,visited);
        return visited[destination]==1;
    }
}