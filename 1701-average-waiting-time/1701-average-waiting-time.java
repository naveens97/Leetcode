class Solution {
    public double averageWaitingTime(int[][] arr) {
        int sum=arr[0][0];
        double avg=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]>sum){
                sum=arr[i][0];
            }
            sum+=arr[i][1];
            avg+=sum-arr[i][0];
        }
        return avg/arr.length;
    }
}