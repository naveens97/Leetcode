class Solution {
    public int xorOperation(int n, int start) {
        int sum=0;
        for(int i=0;i<n;i++){
            int r=i*2 +start;
            sum=sum^r;
        }
        return sum;
    }
}