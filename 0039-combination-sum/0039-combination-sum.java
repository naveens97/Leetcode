class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    List<Integer>list=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        com(arr,0,t,0);
        return ans;
    }
    public void com(int arr[],int ind,int t,int sum){
            if(sum==t){
                ans.add(new ArrayList<>(list));
                return;
            }
            else if(sum>t){
            return;
        }
        for(int i=ind;i<arr.length;i++){
            list.add(arr[i]);
            com(arr,i,t,sum+arr[i]);
            list.remove(list.size()-1);
        }
    }
}