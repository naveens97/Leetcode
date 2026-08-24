class Solution {
    public int removeDuplicates(int[] nums) {
        int c=2;
        for(int i=2;i<nums.length;i++){
            if(nums[c-2]!=nums[i]){
                nums[c]=nums[i];
                c++;
            }
        }
        return c;
    }
}