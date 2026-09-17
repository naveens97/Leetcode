class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    List<Integer>list=new ArrayList<>();
    public List<List<Integer>> subsets(int[] arr) {
        per(arr,0);
        return ans;
    }
    public void per(int arr[],int ind){
        ans.add(new ArrayList<>(list));
        for(int i=ind;i<arr.length;i++){
            list.add(arr[i]);
            per(arr,i+1);
            list.remove(list.size()-1);
        }
    }
}