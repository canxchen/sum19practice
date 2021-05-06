import java.util.*;
public class pacificAtlanticWater {
    int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    public List<int[]> pacificAtlantic(int[][] matrix) { //[down][across]
        List<int[]> ans = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length==0) return ans;

        int m = matrix[0].length; //across
        int n = matrix.length; //down
        boolean[][] atl = new boolean[m][n]; boolean[][] pac = new boolean[m][n];
        for (int i = 0; i < n; i++) { //go down
            dfs(matrix,pac,Integer.MIN_VALUE,i,0); //first column
            dfs(matrix,atl,Integer.MIN_VALUE,i,m-1); //last column column
        }
        for (int i = 0; i < m; i++) { //do across
            dfs(matrix,pac,Integer.MIN_VALUE,0,i); //first row
            dfs(matrix,atl,Integer.MIN_VALUE,n-1,i); //last row
        }

        /*boolean[][] canReachPac = new boolean[matrix.length][matrix[0].length];
        boolean[][] canReachAtl = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < n; i++) //go across: left down, pacific
            canReachAtl[m - 1][i] = canReachPac[0][i] = true;
        for (int i = 0; i < m; i++)
            canReachAtl[i][n - 1] = canReachPac[i][0] = true;

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
                }
            }
        }*/
        ans.add(new int[]{1,1});
        return ans;
    }
    public void dfs(int[][]matrix,boolean[][]visited,int height, int i, int j) {
        int n = matrix.length, m = matrix[0].length;
        if (i<0 || i>=n || j<0 || j>=m || visited[i][j] || matrix[i][j] < height) return;
        visited[i][j]=true;
        for (int[]d:directions) {
            dfs(matrix, visited,matrix[i][j], i+d[0],j+d[1]);
        }
    }
}
