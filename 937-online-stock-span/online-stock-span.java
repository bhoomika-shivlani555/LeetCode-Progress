class StockSpanner {
    Stack<Integer> s;
    ArrayList<Integer> list;
    public StockSpanner() {
        list=new ArrayList<>();
        s=new Stack<>();
    }
    
    public int next(int price) {
        list.add(price);
        int ans=0;
        while(!s.isEmpty() && list.get(s.peek())<=price)
        
            s.pop();
        
        if(s.isEmpty())
            ans=list.size();
        else
            ans=list.size()-s.peek()-1;

        s.push(list.size()-1);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */