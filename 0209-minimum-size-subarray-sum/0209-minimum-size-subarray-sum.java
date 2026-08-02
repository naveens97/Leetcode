class Solution {
    public int minSubArrayLen(int target, int[] arr) {
       int l=0;
       int sum=0;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        while(sum>=target){
            min=Math.min(min,i-l+1);
            sum-=arr[l++];
        }
       }
       return min==Integer.MAX_VALUE?0:min;
    }
}