import java.util.*;

class Solution {
    
    public int[] dx = {0,0,-1,1};
    public int[] dy = {1,-1,0,0};
    
    public int solution(int[][] maps) {
        int answer = -1;
        int n = maps.length;
        int m = maps[0].length;
        int[][] visited = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                visited[i][j] = 0;
            }
        }
        
        answer = bfs(0,0,maps, visited, n-1, m-1);
        
        
        return answer;
    }
    
    public int bfs(int x, int y, int[][] maps, int[][] visited, int targetX, int targetY){
        int level = 1;
        Queue<int[]> Q = new ArrayDeque<>();
        Q.offer(new int[]{x, y});
        visited[x][y] = level;
        
        while(!Q.isEmpty()){
            int[] cur = Q.poll();
            int curX = cur[0];
            int curY = cur[1];
            
            
            for(int i=0; i<4; i++){
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];
                if(nextX >= 0 && nextX < maps.length && nextY >= 0 && nextY < maps[0].length){
                    if(maps[nextX][nextY] == 1){
                        if(visited[nextX][nextY] == 0){
                            Q.offer(new int[]{nextX, nextY});
                            visited[nextX][nextY] = visited[curX][curY] + 1;
                            
                            if(nextX == targetX && nextY == targetY){
                              return visited[nextX][nextY];
                            }
                            
                        }
                    }
                }
            }
        }
        return -1;
    }
}