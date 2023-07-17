import java.io.*;
import java.util.*;

public class Main_22252_정보상인호석 {

	static String name;
	static int n,Q,k,b;
	static long cost =0;
	static Map<String, PriorityQueue<Integer>> info = new HashMap<>();
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		n = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<n; i++) {
		 st = new StringTokenizer(br.readLine());
			
			Q = Integer.parseInt(st.nextToken());
			
			//1일 경우 정보를 파는 사람의 이름과 몇개 파는지 입력받음
			if(Q == 1) {
				name = st.nextToken();
				k = Integer.parseInt(st.nextToken());
				
				//Map에 name이 없을 경우 name을 키로 Map생성
				if(!info.containsKey(name)) {
					info.put(name, new PriorityQueue<>((o1,o2) -> o2 - o1));
				}
				
				PriorityQueue<Integer> pq = info.get(name); //name을 키로하는 우선순위 큐 생성 
				
				
				for(int j=0; j<k; j++) {
					pq.offer(Integer.parseInt(st.nextToken()));
				}
				
			} else {
				name = st.nextToken();
				
				if(!info.containsKey(name)) continue;
				
				b = Integer.parseInt(st.nextToken()); //구매할려는 정보의 개수
				
				PriorityQueue<Integer> pq = info.get(name);
				
				for(int m=0; m<b && !pq.isEmpty(); m++) {
					cost +=pq.poll();
				}
				
			}

		}//for
		
		System.out.println(cost);
		
	}
}