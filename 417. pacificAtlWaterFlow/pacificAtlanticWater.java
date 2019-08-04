import java.util.*;
public class pacificAtlanticWater {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        //[down][across]
        List<List<Integer>> ans = new ArrayList<>();
        if(matrix==null||matrix.length==0) return ans;
        int m = matrix.length; //down
        int n = matrix[0].length; //across
        boolean[][] canReachPac = new boolean[matrix.length][matrix[0].length];
        boolean[][] canReachAtl = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < n; i++) //go across: left down, pacific
            canReachPac[0][i] = true;
        for (int i = 0; i < m; i++) //go down
            canReachPac[i][0] = true;
        for (int i = 0; i < n; i++) //go across: right down, atlantic
            canReachAtl[m - 1][i] = true; //last row
        for (int i = 0; i < m; i++) //go down, last column
            canReachAtl[i][n - 1] = true;

        for (int i = 1; i < m; i++) { //down
            for (int j = 1; j < n; j++) { //left to right
                if ( (canReachPac[i-1][j] && matrix[i-1][j] <= matrix[i][j]) || (canReachPac[i][j-1] && matrix[i][j-1] <= matrix[i][j]) )
                    canReachPac[i][j] = true;
            }
        }
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                if ( (canReachAtl[i+1][j] && matrix[i+1][j] <= matrix[i][j]) || (canReachAtl[i][j+1] && matrix[i][j+1] <= matrix[i][j]) )
                    canReachAtl[i][j] = true;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (canReachPac[i][j] && canReachAtl[i][j]) {
                    ArrayList<Integer> add = new ArrayList<>();
                    add.add(i);add.add(j);ans.add(add);
                }
            }
        }
        return ans;
    }
}
