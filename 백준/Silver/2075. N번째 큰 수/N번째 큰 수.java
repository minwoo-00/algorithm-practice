import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                heap.offer(Integer.parseInt(st.nextToken()));
            }
        }

        int num = 0;
        for(int i=0; i<N; i++){
            num = heap.poll();
        }

        System.out.println(num);
        br.close();
    }
}