class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),i);
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=Math.abs(map.get(s.charAt(i))-i);
        }
        return sum;
    }
}