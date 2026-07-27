class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        int[] arr = new int[total];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[count++] = grid[i][j];
            }
        }
        k = k % total;
        reverse(arr, 0, total - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, total - 1);
        List<List<Integer>> matrix = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(arr[index++]);
            }
            matrix.add(row);
        } 
        return matrix;
    }
    private void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}