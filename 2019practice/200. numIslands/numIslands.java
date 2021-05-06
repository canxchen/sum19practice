public class numIslands {
    int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    int num;
    public int numIslands(char[][] grid) {
        if (grid==null||grid.length==0||grid[0].length==0) return 0;
        num=0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j]) {
                    if(dfs(visited,i,j,grid)) num++;
                }
            }
        }
        return num;
    }
    //during one path, mark all the ones that you can touch with VISISTED[i][j]=TRUE
    //in the for loop, it will skip those visited nodes and only go onto ones where
    //1. grid[i][j] != 0        not 1, not visited
    //2. visited[i][j] != true
    public boolean dfs(boolean[][] visited, int down, int across, char[][] grid) {
        if (down<0||across<0||down>=grid.length||across>=grid[0].length
                ||visited[down][across]||grid[down][across]=='0')
            return false;
        visited[down][across]=true;
        for (int[] arr : directions)
            dfs(visited,down+arr[0],across+arr[1],grid);
        return true;
    }
}
