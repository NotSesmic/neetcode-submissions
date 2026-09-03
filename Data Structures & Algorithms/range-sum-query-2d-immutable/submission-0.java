class NumMatrix {

    int [][] matrix;
    int rows, cols;
    int [][] sum;
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;

        sum = new int[rows][cols];
        sum[0][0] = matrix[0][0];

        for(int j = 1; j < cols;j++){
            sum[0][j] = sum[0][j-1] + matrix[0][j];
        }

        for(int i = 1; i < rows;i++){
            sum[i][0] = sum[i - 1][0] + matrix[i][0];
        }

        for(int i = 1; i < rows;i++){
            for(int j = 1; j < cols;j++){
                sum[i][j] = sum[i - 1][j] + matrix[i][j] + sum[i][j-1] - sum[i - 1][j - 1];
            }
        }
    }

    
    public int sumRegion(int row1, int col1, int row2, int col2) {

        if(matrix == null || matrix.length == 0) return 0;

        int total = sum[row2][col2];

        if(col1 - 1 >= 0) total -= sum[row2][col1 -1];
        if(row1 -1 >= 0) total -= sum[row1 -1][col2];
        if(row1 -1 >= 0 && col1 -1 >= 0) total += sum[row1 -1 ][col1 - 1];
        
        return total;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */