class Solution {
    public int countGoodSubstrings(String s) {
        int l=0;
        int r=2;
        int sum=0;
        while(r<s.length()){
            sum+=val(s.substring(l,r+1));
            l++;
            r++;
        }
        return sum;
    }
    public static int val(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char i:map.keySet()){
            if(map.get(i)>1){
                return 0;
            }
        }
        return 1;
    }
}