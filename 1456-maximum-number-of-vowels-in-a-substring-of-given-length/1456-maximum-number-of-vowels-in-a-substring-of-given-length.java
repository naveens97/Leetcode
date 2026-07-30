class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int v=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                v++;
            }
            if(i-l+1==k){
                 max=Math.max(max,v);
                if(isvowel(s.charAt(l))){
                    v--;
                }
                l++;
            }
        }
        return max;
    }
    public static boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}