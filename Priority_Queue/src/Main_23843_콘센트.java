import java.io.*;
import java.util.*;

public class Main_23843_콘센트 {
		
	static StringTokenizer st;
	static PriorityQueue<Integer> pq1, pq2;
	static int n,m;
	
	public static void charge() {
		while(pq2.size() !=m) {
			if(pq1.isEmpty()) break;
			pq2.add(pq1.poll());
		}
	}
	
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()); //전자기기의 개수
		m = Integer.parseInt(st.nextToken()); //콘센트의 개수
		
		
		
		pq1 = new PriorityQueue<>((o1,o2) -> o2 - o1);
		pq2 = new PriorityQueue<>((o1,o2) -> o1 - o2);
		Queue<Integer> q = new LinkedList<>();
		
		
		//충전에 필요한 시간 입력
		st= new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			pq1.add(Integer.parseInt(st.nextToken()));
		}

		
		charge();
		
		
		int ans =0; //충전 시간
		
	
		while(!pq2.isEmpty()) {
			int t = pq2.peek();
			
			for(int i=0; i<m; i++) {
				if(pq2.peek()-t == 0) pq2.poll();
				else q.add(pq2.poll() -t);
				if(pq2.isEmpty()) break;
			}//for
			
			
			while(!q.isEmpty()) pq2.add(q.poll());
			ans +=t;
		
			charge();
			
		}
		
	System.out.println(ans);
	
	
	}
}