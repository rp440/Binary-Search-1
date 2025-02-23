class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 0 || matrix == null) return false;
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = n * m - 1;
        
        while (low <= high){
            int mid = low + (high - low)/2;
            
            int row = mid / m;
            int column = mid % m;
            
            if (matrix[row][column] == target) return true;
            else if (matrix[row][column] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }
}