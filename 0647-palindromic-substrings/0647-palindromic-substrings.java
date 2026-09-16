class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                c+=val(s.substring(i,j+1));
            }
        }
        return c;
    }
    public static int val(String s){
        if(s.length()<2){
            return 1;
        }
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return 0;
            }
            l++;
            r--;
        }
        return 1;
    }
}