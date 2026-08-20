class Solution {
    public int[] resultArray(int[] arr) {
        int arr1[]=new int[arr.length];
        int arr2[]=new int[arr.length];
        int n1=0;
        int n2=0;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                arr1[n1++]=arr[i];
            }
            else if(i==1){
                arr2[n2++]=arr[i];
            }
            else if(arr1[n1-1]>arr2[n2-1]){
                arr1[n1++]=arr[i];
            }
            else if(arr1[n1-1]<arr2[n2-1]){
                arr2[n2++]=arr[i];
            }
        }
        for(int i=0;i<n2;i++){
            arr1[n1++]=arr2[i];
        }
        return arr1;
    }
}