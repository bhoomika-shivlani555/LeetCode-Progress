class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n=rain.length;
        int alice=0,bob=0;
        String a[]=new String[n];
        for(int x=0;x<n;x++)
        {
            if(rain[x]==1)
            {
                //either alice or bob
                if(x<n-1 && rain[x+1]==1)
                {
                    if(bob>alice)
                    {
                        a[x]="Alice";
                        alice++;
                    }
                    else if(bob==alice)
                    {
                        a[x]="Alice";
                        alice++;
                    }
                    else
                    {
                        a[x]="Bob";
                        bob++;
                    }
                }
                else      //bob
                {
                    a[x]="Bob";
                    bob++;
                }
            }
            else
                a[x]="None";
        }
        return a;
    }
}