import java.io.*;
import java.util.*;

public class Main_1697_숨바꼭질 {

	static int n,k;
	static int time =0;
	static int[] visited = new int[100001];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()); //수빈이의 현재 위치
		k = Integer.parseInt(st.nextToken()); //동생의 위치
		
		if(n == k) {
			System.out.println(0);
		} else{
			BFS(n);
		}
		
		
		
	}
	
	
	static void BFS(int num) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(num);
		visited[num] = 1;
		
		while(!Q.isEmpty()) {
			int temp = Q.poll();
			
			for(int i=0; i<3; i++) {
				int now;
				
				if(i ==0) {
					now = temp + 1;
				} else if (i == 1){
					now = temp - 1;
				} else {
					now = temp * 2;
				}
				
				if(now == k) {
					System.out.println(visited[temp]);
					return;
				}
			
				if(now >=0 && now < visited.length && visited[now] == 0) {
					Q.add(now);
					visited[now] = visited[temp]+1; 			
				}	
				
			}//for	
		}//while
	}
}
