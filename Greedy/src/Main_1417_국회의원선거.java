import java.io.*;
import java.util.*;

public class Main_1417_국회의원선거 {

	static int dasom, second,third;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());//후보의 수 
		int dasom = Integer.parseInt(br.readLine());
		
		//o2.compareTo(o1) : o2가 o1보다 우선순위가 높을 경우 음수를, 같은 우선순위일 경우 0을, 우선순위가 낮을 경우 양수를 반환
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2) -> o2.compareTo(o1));
		
		
		for(int i=0; i<n-1; i++) {
			pq.offer(Integer.parseInt(br.readLine()));	
		}

		int cnt =0;
		
		
		while(!pq.isEmpty() && dasom++ <=pq.peek()) {
			pq.offer(pq.poll()-1);
			++cnt;
		}
		
		System.out.println(cnt);
		
	}
}