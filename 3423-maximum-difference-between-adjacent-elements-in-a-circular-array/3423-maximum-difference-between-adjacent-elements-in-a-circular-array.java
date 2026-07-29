class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            int sum=Math.abs(nums[i]-nums[(i+1)%n]);
            max=Math.max(sum,max);
        }
        return max;
    }
}