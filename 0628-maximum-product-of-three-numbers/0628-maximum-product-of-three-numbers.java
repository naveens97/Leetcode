class Solution {
    public int maximumProduct(int[] arr) {
       Arrays.sort(arr);
       int n=arr.length;
       int pro1=arr[n-1]*arr[n-2]*arr[n-3];
       int pro2=arr[0]*arr[1]*arr[n-1];
       return Math.max(pro1,pro2);
    }
}