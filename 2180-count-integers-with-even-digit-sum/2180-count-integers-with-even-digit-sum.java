class Solution {
    public int countEven(int num) {
        int max=0;
        for(int i=num;i>=2;i--){
            max+=val(i);
        }
        return max;
    }
    public static int val(int n){
        int sum=0;
        while(n!=0){
            int temp=n%10;
            sum+=temp;
            n/=10;
        }
        if(sum%2==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}