import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Pair implements Comparable<Pair>{
	int id;
	double score;
	
	public Pair(int id, double score) {
		this.id = id;
		this.score = score;
	}
	
	
	@Override
	public int compareTo(Pair o) {	
		return Double.compare(o.score, this.score);
	}
}


public class Main_2865_위대한슈스K {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int n = Integer.parseInt(st.nextToken()); //예선 참가자 수 
		int m = Integer.parseInt(st.nextToken()); //장르
		int k = Integer.parseInt(st.nextToken()); //본선에 나갈 수 있는 인원수 
		
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		for(int i=0; i<m;i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<n; j++) {
				int I = Integer.parseInt(st.nextToken());
				double s = Double.parseDouble(st.nextToken());
			
				pq.add(new Pair(I,s));	
			}
		}
		
		
		double ans = 0;
		
		while(!pq.isEmpty()) {
			Pair p = pq.poll();
			
			if(list.size() >= k) break;
			
			if(!list.contains(p.id)) {
				ans += p.score;
				list.add(p.id);
				
			} else {
				continue;
			}
			
		
		}//while
	  
		System.out.printf("%.1f\n", ans);
		
	}
}
