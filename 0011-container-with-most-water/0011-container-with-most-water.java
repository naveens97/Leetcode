class Solution {
    public int maxArea(int[] arr) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int val=0;
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            min=Math.min(arr[l],arr[r]);
            val=Math.abs(r-l);
            max=Math.max(val*min,max);
            if(arr[l]>arr[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return max;
    }
}