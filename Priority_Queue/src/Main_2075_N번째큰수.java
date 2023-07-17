import java.io.*;
import java.util.*;

public class Main_2075_N번째큰수 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		

		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<n; j++) {
				int temp = Integer.parseInt(st.nextToken());
				
				if(pq.size() == n) {
					if(pq.peek() < temp) {
						pq.poll();
						pq.add(temp);
					}
				} else {
					pq.add(temp);
				}
			}
		}//for_i
		
		
		System.out.println(pq.poll());
		
	}
}
