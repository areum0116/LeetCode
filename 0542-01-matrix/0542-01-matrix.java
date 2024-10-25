class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int m = mat.length, n = mat[0].length;
        int[][] answer = new int[m][n];
        Queue<int[]> q = new LinkedList<>();

        for (int[] ans : answer) {
            Arrays.fill(ans, -1);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    q.add(new int[]{i, j});
                    answer[i][j] = 0;
                }
            }
        }

        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];
            for (int[] d : dir) {
                int newX = x + d[0], newY = y + d[1];
                if(newX >= 0 && newX < m && newY >= 0 && newY < n && answer[newX][newY] == -1) {
                    answer[newX][newY] = answer[cur[0]][cur[1]] + 1;
                    q.add(new int[]{newX, newY});
                }
            }
        }

        return answer;
    }
}