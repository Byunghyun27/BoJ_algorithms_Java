import java.io.*;
import java.util.*;

public class Main_28107_회전초밥 {

	   public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());

	        int n = Integer.parseInt(st.nextToken()); // 손님의 수
	        int m = Integer.parseInt(st.nextToken()); // 초밥의 수

	        
	        Queue<Integer>[] queues = new Queue[200001]; // 큐 배열 생성

	        
	        for (int i = 0; i <= 200000; i++) {
	            queues[i] = new LinkedList<>(); // 각 큐 초기화
	        }

	        
	        Map<Integer, Integer> sushi = new HashMap<>();
	        
	        
	        for (int i = 0; i < n; i++) {
	            st = new StringTokenizer(br.readLine());
	            int k = Integer.parseInt(st.nextToken());

	            for (int j = 0; j < k; j++) {
	                int s = Integer.parseInt(st.nextToken());
	                sushi.put(i, s);
	                queues[s].add(i); // 해당 초밥 번호에 대한 큐에 손님 번호 추가
	            }
	        }

	        
	        
	        Queue<Integer> q = new LinkedList<>();
	        
	        
	        
	        st = new StringTokenizer(br.readLine());
	        for (int i = 0; i < m; i++) {
	            q.add(Integer.parseInt(st.nextToken()));
	        }

	        
	        int[] cnt = new int[n];

	        
	        while (!q.isEmpty()) {
	        	int eat = q.poll();

	            Queue<Integer> queue = queues[eat];

	            if (!queue.isEmpty()) {
	                int guest = queue.poll();
	                cnt[guest]++;
	            }
	            
	           
	        }

	      // 결과 출력
	       for (int i = 0; i < n; i++) {
	          System.out.print(cnt[i] + " ");     
	       }
	       
    }
}