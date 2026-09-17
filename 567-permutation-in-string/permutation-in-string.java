class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s2.length();
        int k=s1.length();
        int l=0,r=0;
        int arr[]=new int[26];
        int arr2[]=new int[26];

        Arrays.fill(arr,0);
        Arrays.fill(arr2,0);
        for(int x=0;x<k;x++)
            arr[s1.charAt(x)-'a']++;

        while(r<n)
        {
            char c=s2.charAt(r);
            arr2[c-'a']++;
            if(r-l+1>k)
            {
                char c1=s2.charAt(l);
                arr2[c1-'a']--;
                l++;
            }
            if(r-l+1==k)
            {
                if(Arrays.equals(arr,arr2))
                    return true;
            }
            r++;
        }
        return false;
    }
}