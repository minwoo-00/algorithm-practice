import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> {
            if(Math.abs(a) != Math.abs(b)){
                return Integer.compare(Math.abs(a), Math.abs(b));
            }else{
                return Integer.compare(a, b);
            }
        });

        for(int i=0; i<N; i++){
            int x = Integer.parseInt(br.readLine());

            if(x == 0){
                if(heap.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(heap.poll());
                }
            }else{
                heap.offer(x);
            }

        }
    }
}