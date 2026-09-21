class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    ArrayList<Integer>list=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        int arr[]=new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1]=i;
        } 
        com(arr,0,k);
        return ans;
    }
    public void com(int arr[],int ind,int k){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            list.add(arr[i]);
            com(arr,i+1,k);
            list.remove(list.size()-1);
        }
    }
}