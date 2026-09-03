class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int numOfRows = matrix.length;
        int numOfColumns = matrix[0].length;
        int targetRow = 0;
        boolean targetPresent = false;
        for(int i =0; i < numOfRows;i++){
            if(target >= matrix[i][0] && target <= matrix[i][numOfColumns - 1]){
                targetRow = i;
                break;
            }
        }

        int low = 0;
        int high = numOfColumns - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(matrix[targetRow][mid] < target){
                low = mid + 1;
            }
            else if(matrix[targetRow][mid] > target){
                high = mid - 1;
            }
            else{
                targetPresent = true;
                break;
            }
        }
        return targetPresent;
    }
}
