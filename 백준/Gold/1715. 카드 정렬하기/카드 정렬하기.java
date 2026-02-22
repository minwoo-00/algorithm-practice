import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i=0; i<N; i++){
            heap.offer(Integer.parseInt(br.readLine()));
        }

        int sum = 0;
        while(heap.size() > 1){
            int num1 = heap.poll();
            int num2 = heap.poll();
            sum += (num1 + num2);
            heap.offer(num1 + num2);
        }

        System.out.println(sum);
        br.close();
    }
}