class Solution {
    void DFS(int idx,ArrayList<Integer> arr[],int visited[])
    {
        if(visited[idx]==1)
            return;
        visited[idx]=1;
        for(int x=0;x<arr[idx].size();x++)
        {
            int neighbour=arr[idx].get(x);
            if(visited[neighbour]==0)
                DFS(neighbour,arr,visited);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        ArrayList<Integer> arr[]=(ArrayList<Integer>[]) new ArrayList[n];
        for(int x=0;x<n;x++)
        {
            arr[x] = new ArrayList<>();
        }
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<n;y++)
            {
                if(x!=y && isConnected[x][y]==1)
                    arr[x].add(y);
            }
        }
        int count=0;
        int visited[]=new int[n];
        Arrays.fill(visited,0);
        for(int x=0;x<n;x++)
        {
            if(visited[x]==0)
            {
                DFS(x,arr,visited);
                count++;
            }
        }
        return count;
    }
}