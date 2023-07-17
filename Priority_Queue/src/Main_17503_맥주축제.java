import java.io.*;
import java.util.*;


public class Main_17503_맥주축제 {
	
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //축제가 열리는 기간
		int m = Integer.parseInt(st.nextToken()); //채워야 하는 선호도의 합 
		int k = Integer.parseInt(st.nextToken()); //마실 수 있는 맥주 종류의 수
		
		int[][] num = new int[k][2];
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		
		//v : 선호도, c : 도수 레벨
		for(int i=0; i<k; i++) {
			st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken()); //선호도
			int c = Integer.parseInt(st.nextToken()); //도수 레벨
			
			num[i][0] = v;
			num[i][1] = c;
		}//for

		Arrays.sort(num, (o1,o2) -> {
			if(o1[1] == o2[1]) {
				return o2[0] -o1[0];
			} else {
				return o1[1] - o2[1];
			}
			
		});
		
		
		int total = 0;
		boolean check = false;
		
		
		for(int i=0; i<k; i++) {
			pq.add(num[i][0]); //선호도 저장
			total += num[i][0];
			
			
			if(pq.size() > n) {
				total -= pq.poll();
			}
			
			if(pq.size() == n && total >=m) {
				check = true;
				System.out.println(num[i][1]);
				break;
			}
		}//for
		
		if(!check) {
			System.out.println(-1);
		}
        
    }
}

