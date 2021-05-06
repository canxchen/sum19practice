public class setMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;
        boolean rowis0 = false;
        boolean colis0 = false;
        //row check
        for (int i = 0; i < matrix[0].length; i++) {
            if (rowis0 = matrix[0][i] == 0)
                break;
        }

        //column check
        for (int i = 0; i < matrix.length; i++) {
            if (colis0 = matrix[i][0] == 0)
                break;
        }

        //check everything but first row and column
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //fill columns based on markers: you cant do row by row, and then column by column,
        //bc the row by row will rui the markers for the column by columns
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        //fill row and columns as needed
        if (rowis0) {
            for (int i = 0; i < matrix[0].length; i++)
                matrix[0][i] = 0;
        }
        if (colis0) {
            for (int i = 0; i < matrix.length; i++)
                matrix[i][0] = 0;
        }
    }
}
