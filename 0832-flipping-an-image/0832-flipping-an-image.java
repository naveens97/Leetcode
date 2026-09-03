class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            int l=0;
            int r=arr[i].length-1;
            while(l<r){
                int temp=arr[i][l];
                arr[i][l]=arr[i][r];
                arr[i][r]=temp;
                l++;
                r--;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }
}