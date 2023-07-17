import java.io.*;
import java.util.*;

public class Main_19638_센티와마법의뿅망치 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //거인의 인구수
		int h = Integer.parseInt(st.nextToken()); //센티의 키
		int t = Integer.parseInt(st.nextToken()); //뿅망치의 횟수 제한
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		
		
		for(int i=0; i<n; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		
		
		int cnt =0; //마법의 망치 사용 횟수
		
		
		for(int i=0; i<t; i++) {
			if((pq.peek() < h) || (pq.peek()==1)) break;
			cnt++;
			pq.offer(pq.poll()/2);
		}//for
		
		StringBuilder sb = new StringBuilder();
		
		int num = pq.poll();
		
		if(num>= h) {
			sb.append("NO\n");
			sb.append(num+"\n");
		} else {
			sb.append("YES\n");
			sb.append(cnt);
		}
			
		
		System.out.println(sb);
		
		
	}
}