class Solution {
    public int maxProfit(int[]arr) {
        int pro=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                pro+=arr[i]-arr[i-1];
            }
        }
        return pro;
    }
}