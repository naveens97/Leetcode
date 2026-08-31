class Solution {
    public int maxNumberOfBalloons(String s) {
        int a=0,b=0,o=0,l=0,n=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                a++;
            }
            else if(ch=='b'){
                b++;
            }
            else if(ch=='o'){
                o++;
            }
            else if(ch=='n'){
                n++;
            }
            else if(ch=='l'){
                l++;
            }
        }
        l/=2;
        o/=2;
        return Math.min(a,Math.min(b,Math.min(o,Math.min(l,Math.min(n,Integer.MAX_VALUE)))));
    }
}