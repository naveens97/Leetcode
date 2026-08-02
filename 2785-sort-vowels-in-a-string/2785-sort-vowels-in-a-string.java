class Solution {
    public String sortVowels(String s) {
        StringBuilder sb=new StringBuilder();
        ArrayList<Character>list=new ArrayList<>();
        String t=s;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                list.add(s.charAt(i));
            }
        }
        int count=0;
        Collections.sort(list);
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='a'||t.charAt(i)=='e'||t.charAt(i)=='i'||t.charAt(i)=='o'||t.charAt(i)=='u'||t.charAt(i)=='A'||t.charAt(i)=='E'||t.charAt(i)=='I'||t.charAt(i)=='O'||t.charAt(i)=='U'){
                sb.append(list.get(count++));
            }
            else{
                sb.append(t.charAt(i));
            }
        }
        return sb.toString();
    }
}