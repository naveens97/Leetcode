class Solution {
    public int totalWaviness(int num1, int num2) {
        int sum=0;
        for(int j=num1;j<=num2;j++){
            String s=Integer.toString(j);
            System.out.println(s);
            char ch[]=s.toCharArray();
            for(int i=1;i<ch.length-1;i++){
                if((ch[i-1]>ch[i]&&ch[i]<ch[i+1])||(ch[i-1]<ch[i]&&ch[i]>ch[i+1])){
                    sum+=1;
                }
            }
        }
        return sum;
    }
}