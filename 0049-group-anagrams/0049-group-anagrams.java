class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        for(String i:map.keySet()){
            ans.add(map.get(i));
        }
        return ans;
    }
}