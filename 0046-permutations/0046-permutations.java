class Solution {
    List<List<Integer>>ans;
    public List<List<Integer>> permute(int[] arr) {
        ans=new ArrayList<>();
        per(arr,0);
        return ans;
    }
    public void per(int []arr,int ind){
        ArrayList<Integer>list=new ArrayList<>();
        if(ind==arr.length){
            for(int i:arr){
                list.add(i);
            }
            ans.add(list);
        }
        for(int i=ind;i<arr.length;i++){
            int temp=arr[ind];
            arr[ind]=arr[i];
            arr[i]=temp;
            per(arr,ind+1);
            int temp1=arr[i];
            arr[i]=arr[ind];
            arr[ind]=temp1;
        }
    }
}