class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
        int val=0;
       for(int i=min;i>=1;i--){
        if(max%i==0&&min%i==0){
            val=i;
            break;
        }
       }
        return val;
    }
}