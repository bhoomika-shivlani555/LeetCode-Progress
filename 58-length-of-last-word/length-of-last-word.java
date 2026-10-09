
class Solution {
    public int lengthOfLastWord(String s) 
    {
        s = s.trim();
        int io=s.lastIndexOf(' ');
        String w=s.substring(io+1,s.length());
        return w.length();
    }
}