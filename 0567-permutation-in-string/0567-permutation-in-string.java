class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m){
            return false;
        }
        int need[]=new int[26];
        int have[]=new int[26];
        for(int i=0;i<n;i++){
            need[s1.charAt(i)-'a']++;
            have[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(need,have)){
            return true;
        }
        for(int r=n;r<m;r++){
            have[s2.charAt(r)-'a']++;
            have[s2.charAt(r-n)-'a']--;
            if(Arrays.equals(have,need)){
                return true;
            }
        }
        return false;
    }
}