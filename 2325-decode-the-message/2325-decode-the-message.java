class Solution {
    public String decodeMessage(String key, String message) {
        char c='a';
        HashMap<Character,Character>map=new HashMap<>();
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(ch!=' '&& !map.containsKey(ch)){
                map.put(ch,c++);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<message.length();i++){
            char ch=message.charAt(i);
            if(ch==' '){
                sb.append(' ');
            }
            else{
                sb.append(map.get(ch));
            }
        }
        return sb.toString();
    }
}