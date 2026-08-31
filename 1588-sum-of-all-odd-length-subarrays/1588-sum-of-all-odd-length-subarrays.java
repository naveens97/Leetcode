class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int l=0;
            for(int j=i;j<n;j++){
                l+=arr[j];
                if((j-i+1)%2!=0){
                    sum+=l;
                }
            }
        }
        return sum;
    }
}