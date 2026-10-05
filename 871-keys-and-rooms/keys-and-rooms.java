class Solution {
    void DFS(int idx,List<List<Integer>> rooms,int visited[])
    {
        visited[idx]=1;
        List<Integer> list=rooms.get(idx);
        for(int x=0;x<list.size();x++)
        {
            int neighbour=list.get(x);
            if(visited[neighbour]==0)
                DFS(neighbour,rooms,visited);
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        int visited[]=new int[n];
        Arrays.fill(visited,0);
        for(int x=0;x<n;x++)
        {
            if(visited[x]==0)
            {
                DFS(0,rooms,visited);
            }
        }
        for(int x=0;x<n;x++)
        {
            if(visited[x]==0)
                return false;
        }
        return true;
    }
}