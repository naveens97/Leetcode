class Solution {
    public int distributeCandies(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(0,i)+1);
        }
        if(map.size()<n/2){
            return map.size();
        }
        return n/2;
    }
}