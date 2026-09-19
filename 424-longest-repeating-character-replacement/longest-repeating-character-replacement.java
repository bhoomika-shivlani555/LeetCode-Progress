class Solution {
    public int characterReplacement(String s, int k) {
        int arr[]=new int[26];
        Arrays.fill(arr,0);
        int l=0,r=0,n=s.length();
        int max=0;
        // char maxchar='\u0000';
        int countMax=0;
        while(r<n)
        {
            char c=s.charAt(r);
            arr[c-'A']++;
            max=arr[0];
            for(int x=0;x<26;x++)
            {
                if(max<arr[x])
                {
                    max=arr[x];
                    // maxchar=char(x+'a');
                }
            }

            while(r-l+1-max>k)
            {
                char c1=s.charAt(l);
                arr[c1-'A']--;
                max=arr[0];
                for(int x=0;x<26;x++)
                {
                    if(max<arr[x])
                    {
                        max=arr[x];
                        // maxchar=char(x+'a');
                    }
                }
                l++;
            }

            if(r-l+1-max<=k)
            {
                countMax=Math.max(countMax,r-l+1);
            }
            r++;
        }
        return countMax;
    }
}