import java.io.*;
import java.util.*;

public class Main_23757_아이들과선물상자 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //선물 상자의 수 
		int m = Integer.parseInt(st.nextToken()); //아이들의 수 
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int[] want = new int[m];
		
		
		//선물 상자에 들어있는 선물의 수
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			pq.add(Integer.parseInt(st.nextToken()));
		}
		
		
		//원하는 선물의 수
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			want[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt =0;
		boolean check = true;
		
		for(int i=0;i<m;i++) {
			int num = pq.poll();

			if(num < want[i]) {
				check = false;
				break;
			} else {
				pq.offer(num-want[i]);
			}
			
		}//for
		
		if(check) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		
		
		
		
	}
}