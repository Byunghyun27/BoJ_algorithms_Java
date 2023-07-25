import java.io.*;
import java.util.*;

public class No_11000_강의실배정 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] time = new int[n][2];
		
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			time[i][0] = Integer.parseInt(st.nextToken()); //Si
			time[i][1] = Integer.parseInt(st.nextToken()); //Ti
		}
		
		Arrays.sort(time, (o1, o2) -> {
			if(o1[0] == o2[0]) return o1[1] - o2[1]; //같은 시간일 경우 빨리 끝나는 순번
			else return o1[0] - o2[0]; //시작시간 순서 정렬
		});
		
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		
		for(int i=0; i<n; i++) {
			int start = time[i][0];
			int end = time[i][1];
			
			if(!q.isEmpty() && q.peek() <=start) { //시작시간이 일찍 끝나는 시간보다 크거나 같으면 기존 강의실 이용
				q.poll(); 
			}
			q.offer(end);
		}	
		
		System.out.println(q.size());
		
	}
}