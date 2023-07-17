import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main_14235_크리스마스선물 {
	
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());//아이들 방문 횟수
		int[] gift = new int[n];
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n;i ++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());	
			
			if(a ==0 ) {
				if(pq.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(pq.poll()+"\n");
				}
			} else if(a != 0) {
				for(int j=0; j<a; j++) {
					pq.add(Integer.parseInt(st.nextToken()));
				}
			}
	
			
		}//for
		

		System.out.println(sb.toString());
		
	}
}