class Solution {
    public int countOperations(int n, int m) {
        int count=0;
        int num1=n;
        int num2=m;
        while(num1>0 && num2>0){
            if(num1>num2){
                num1=num1-num2;
                count++;
            }
            else{
                num2=num2-num1;
                count++;
            }
        }
        return count;
    }
}