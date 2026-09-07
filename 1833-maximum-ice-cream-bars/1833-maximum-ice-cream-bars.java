class Solution {
    public int maxIceCream(int[] arr, int coins) {
        Arrays.sort(arr);
        int i=0;
        while(i<arr.length&&arr[i]<=coins){
            coins-=arr[i++];
        }
        return i;
    }
}