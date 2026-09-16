class Solution {
List<List<Integer>>ans=new ArrayList<>();
List<Integer>list=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        boolean narr[]=new boolean[9];
        per(arr,narr,n,k,0);
        return ans;
    }
    public void per(int arr[],boolean narr[],int n,int k,int start){
        if(list.size()==k){
            int sum=0;
            for(int i:list){
                sum+=i;
            }
            if(sum==n){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i=start;i<arr.length;i++){
            if(narr[i]){
                continue;
            }
            list.add(arr[i]);
            narr[i]=true;
            per(arr,narr,n,k,i+1);
            list.remove(list.size()-1);
            narr[i]=false;
        }
    }
}