import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix==null || matrix.length==0 || matrix[0].length==0) return ans;
        int row_end = matrix[0].length - 1; int col_end = matrix.length - 1; int nums = (row_end+1)*(col_end+1);
        int i = 0;
        int col_start = 0, row_start = 0;
        while (i < nums) {
            //left to right, same height
            for (int j = row_start; j <= row_end && i < nums; j++) {
                ans.add(matrix[col_start][j]); //0,1 : 0,2
                i++;
            }
            col_start++;
            //top to down, same LR
            for (int j = col_start; j <= col_end && i < nums; j++) {
                ans.add(matrix[j][row_end]);i++;
            }
            row_end--;
            //right to left, same height
            for (int j = row_end; j >= row_start && i < nums; j--) {
                ans.add(matrix[col_end][j]);i++;
            }
            col_end--;
            //down to up, same LR
            for (int j = col_end; j >= col_start && i < nums; j--) {
                ans.add(matrix[j][row_start]);i++;
            }
            row_start++;
        }
        return ans;
    }
}
