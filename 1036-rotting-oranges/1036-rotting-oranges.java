class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(grid[i][j] == 1) fresh++;
                else if(grid[i][j] == 2)
                    queue.offer(new int[]{i, j});
            }
        }
        if(fresh == 0) return 0;
        if(queue.isEmpty()) return -1;
        
        int[] moveX = {-1, 1, 0, 0};
        int[] moveY = {0, 0, -1, 1};
        int minutes = -1;
        while (!queue.isEmpty()) {
            minutes++;
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                int[] current = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int row = current[0] + moveX[j];
                    int col = current[1] + moveY[j];
                    if (row < 0 || row >= rows || col < 0 || col >= cols) continue;
                    if(grid[row][col] == 0 || grid[row][col] == 2) continue;

                    queue.offer(new int[]{row, col});
                    grid[row][col] = 2;
                    fresh--;
                }
            }
        }
        if(fresh == 0) return minutes;
        return -1;
    }
}