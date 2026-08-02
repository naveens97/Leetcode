class Solution {
    public int addedInteger(int[] arr, int[] arr1) {
        int min=Integer.MAX_VALUE;
        int min1=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr1[i]<min1){
                min1=arr1[i];
            }
        }
        return min1-min;
    }
}