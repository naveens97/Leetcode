class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pro=1;
        int og=n;
        while(og!=0){
            int temp=og%10;
            sum+=temp;
            pro*=temp;
            og/=10;
        }
        og=sum+pro;
        return n%og==0?true:false;
    }
}