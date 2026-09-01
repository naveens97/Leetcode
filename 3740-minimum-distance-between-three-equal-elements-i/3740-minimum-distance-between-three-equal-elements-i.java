class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        int sum=0;
        if(n<3){
            return -1;
        }
        int max=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]==nums[j]&&nums[k]==nums[j]&&nums[i]==nums[k]){
                        int r=Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                         max=Math.min(max,r);
                    }
                }
            }
        }
        return max==Integer.MAX_VALUE?-1:max;
    }
}