import java.io.*;
import java.util.*;


public class Note {
		
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //전자기기의 개수
		int m = Integer.parseInt(st.nextToken()); //콘센트의 개수
		
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2) -> o2 - o1);
		
		//충전에 필요한 시간 입력
		st= new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			pq.add(Integer.parseInt(st.nextToken()));
		}

		PriorityQueue<Integer> use = new PriorityQueue<>();
	
		
		int ans =0; //충전 시간
		
		
		while(!pq.isEmpty()) {
			
			if(use.size() != m) {
				use.add(pq.poll());
			} else {
				use.add(use.poll() + pq.poll());
			}
		}//while
		
		while(use.size() !=1) {
			use.poll();
		}
		
		ans += use.peek();
		
		
		System.out.println(ans);
		
	}
}