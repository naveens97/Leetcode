class Solution {
    public long sumAndMultiply(int n) {
        long a=0;
        int sum=0;
        long mul=1;
        while(n!=0){
            int temp=n%10;
            if(temp!=0){
                sum+=temp;
                a=temp*mul+a;
                mul*=10;
            }
            n/=10;
        }
        return a*sum;
    }
}