class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    List<Integer>list=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean bool[]=new boolean[nums.length];
        per(nums,bool);
        return ans;
    }
    public void per(int arr[],boolean bool[]){
        if(arr.length==list.size()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(bool[i]||(i>0 && !bool[i-1] && arr[i]==arr[i-1])){
             continue;   
            }
            list.add(arr[i]);
            bool[i]=true;
            per(arr,bool);
            list.remove(list.size()-1);
            bool[i]=false;
        }
    }
}