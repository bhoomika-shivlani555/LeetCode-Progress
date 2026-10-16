class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        int arr[]=nums.clone();

        Arrays.sort(arr);

        int j=(n+1)/2-1;
        int k=n-1;

        for (int i=0;i<n;i++) {
            if (i%2==0) 
                nums[i]=arr[j--];
            else 
                nums[i]=arr[k--];
        }
    }
}