import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(i, new ArrayList<>());
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i != j && computers[i][j] == 1){
                    adj.get(i).add(j);
                }
            }
        }
        
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++){
            visited[i] = false;
        }
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                bfs(i, adj, visited);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void bfs(int a, List<List<Integer>> adj, boolean[] visited){
        Queue<Integer> Q = new ArrayDeque<>();
        Q.offer(a);
        visited[a] = true;
        
        while(!Q.isEmpty()){
            int cur = Q.poll();
            
            for(int next : adj.get(cur)){
                if(!visited[next]){
                    Q.offer(next);
                    visited[next] = true;
                }
            }
        }
    }
}  