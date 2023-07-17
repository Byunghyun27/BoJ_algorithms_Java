import java.io.*;
import java.util.*;

public class Main_12018_YonseiToTo {
	
	static int cnt = 0;
	static int ans = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //과목 수
		int m = Integer.parseInt(st.nextToken()); //주어진 마일리지
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
				int p = Integer.parseInt(st.nextToken());//과목을 신청한 사람 수
				int L = Integer.parseInt(st.nextToken()); //과목의 수강인원 수
								
				PriorityQueue<Integer> q = new PriorityQueue<>();
				
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<p; j++) {
					q.add(Integer.parseInt(st.nextToken()));
				}
				
				if(p<L) {
					pq.add(1);
					continue;
					
				} else {
					for(int k=0; k<(p-L); k++) {
						q.poll();
					}
					pq.offer(q.peek());
				}
				
				
			}//for_i
		
		
		for(int i=0; i<n; i++) {
			ans += pq.poll();
			if(ans > m) {
				break;
			}
			
			cnt++;
		}
		
		System.out.println(cnt);
		
	}

}
