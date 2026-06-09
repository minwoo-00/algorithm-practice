import java.util.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int m = arr1.length;
        int n = arr1[0].length;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr1[i][j] += arr2[i][j];
            }
        }
        
        return arr1;
    }
}