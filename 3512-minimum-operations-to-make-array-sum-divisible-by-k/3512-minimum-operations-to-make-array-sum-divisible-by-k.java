class Solution {
    public int minOperations(int[] nums, int k) {
      int sumNums = 0;
      for (int i = 0; i < nums.length; i++){
        sumNums += nums[i];
      }
      return sumNums % k;  
    }
}