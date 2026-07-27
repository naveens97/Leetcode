class Solution {
    public int maxProduct(int n) {
        int pro=1;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        while(n!=0){
            int max=n%10;
            if(max>=max1){
                max2=max1;
                max1=max;
            }
            else if(max>max2){
                max2=max;
            }
            n/=10;
        }
        return max1*max2;
    }
}