class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int sum=0;
        int c=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>=(t*k)){
            c++;
        }
        int l=0;
        int r=k;
        while(r<arr.length){
            sum+=arr[r++];
            sum-=arr[l++];
            if(sum>=(t*k)){
                c++;
            }
        }
        return c;
    }
}