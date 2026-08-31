class Solution {
    public int canBeTypedWords(String s, String t) {
        String arr[]=s.split(" ");
        int sum=0;
        for(int i=0;i<arr.length;i++){
            String p=arr[i];
            HashMap<Character,Integer>map=new HashMap<>();
            for(int j=0;j<p.length();j++){
                char ch=p.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            int val=1;
            for(int k=0;k<t.length();k++)
            {
                char ch1=t.charAt(k);
                if(map.containsKey(ch1)){
                    val=0;
                }
            }
            if(val==1){
                sum+=1;
            }
        }
        return sum;
    }
}