class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max+=val(nums[i],digit);
        }
        return max;
    }
    public static int val(int n,int d){
        int count=0;
        while(n!=0){
            int temp=n%10;
            if(temp==d){
                count++;
            }
            n/=10;
        }
        return count;
    }
}