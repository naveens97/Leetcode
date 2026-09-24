class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        if(n==1){
            return arr[0];
        }
        if(n==2){
            return Math.max(arr[0],arr[1]);
        }
        int dp[]=new int[n];
        dp[0]=arr[0];
        dp[1]=arr[1];
        dp[2]=dp[0]+arr[2];
        for(int i=3;i<arr.length;i++){
            dp[i]=arr[i]+Math.max(dp[i-2],dp[i-3]);
        }
        return Math.max(dp[n-1],dp[n-2]);
    }
}