class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int dob=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                sum+=nums[i];
            }
            else{
                dob+=nums[i];
            }
        }
        if(sum==dob){
            return false;
        }
        return true;
    }
}