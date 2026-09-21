class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map=new HashMap<>();
    for(int x=0;x<matches.length;x++)
    {
        map.put(matches[x][0],0);
        map.put(matches[x][1],0);
    }

    for(int x=0;x<matches.length;x++)
    {
        map.put(matches[x][1],map.get(matches[x][1])+1);
    }

    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> list0=new ArrayList<>();
    List<Integer> list1=new ArrayList<>();


    for(int x:map.keySet())
    {
        if(map.get(x)==0)
            list0.add(x);
        if(map.get(x)==1)
            list1.add(x);
    }
    Collections.sort(list0);
    Collections.sort(list1);
    ans.add(list0);
    ans.add(list1);

    return ans;
    }
}