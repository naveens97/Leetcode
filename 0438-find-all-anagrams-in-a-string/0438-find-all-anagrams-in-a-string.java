class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>list=new ArrayList<>();
        int arr1[]=new int[26];
        for(int i=0;i<p.length();i++){
            arr1[p.charAt(i)-'a']++;
        }
        int l=0;
        int r=p.length();
        while(r<=s.length()){
            int arr2[]=new int[26];
            for(int i=l;i<r;i++){
                arr2[s.charAt(i)-'a']++;
            }
            if(Arrays.equals(arr1,arr2)){
                list.add(l);
            }
            l++;
            r++;
        }
        return list;
    }
}