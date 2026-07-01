class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        int[][] dist = new int[n][n];
        for (int[] d : dist) Arrays.fill(d, -1);

        Queue<int[]> q = new LinkedList<>();

        // Multi-source BFS from thieves
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    q.offer(new int[]{i, j});
                    dist[i][j] = 0;
                }
            }
        }

        int[] dir = {-1, 0, 1, 0, -1};

        while (!q.isEmpty()) {
            int[] c = q.poll();
            for (int k = 0; k < 4; k++) {
                int x = c[0] + dir[k], y = c[1] + dir[k + 1];
                if (x >= 0 && y >= 0 && x < n && y < n && dist[x][y] == -1) {
                    dist[x][y] = dist[c[0]][c[1]] + 1;
                    q.offer(new int[]{x, y});
                }
            }
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[2] - a[2]);
        boolean[][] vis = new boolean[n][n];

        pq.offer(new int[]{0, 0, dist[0][0]});
        vis[0][0] = true;

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int r = cur[0], c = cur[1], safe = cur[2];

            if (r == n - 1 && c == n - 1) return safe;

            for (int k = 0; k < 4; k++) {
                int x = r + dir[k], y = c + dir[k + 1];
                if (x >= 0 && y >= 0 && x < n && y < n && !vis[x][y]) {
                    vis[x][y] = true;
                    pq.offer(new int[]{x, y, Math.min(safe, dist[x][y])});
                }
            }
        }
        return 0;
    }
}