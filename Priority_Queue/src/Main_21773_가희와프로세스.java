import java.io.*;
import java.util.*;

public class Main_21773_가희와프로세스 {
/*
  1. 우선 순위 값이 제일 큰 프로세스
  2. 우선 순위 값이 제일 큰 프로세스가 여러 개라면, id가 가장 작은 프로세스
 */
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		//내림차순 정렬
		PriorityQueue<Process> pq = new PriorityQueue<>();
		
		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken()); //ex ) t= 7, 1초부터 7초일 때 까지 
		int n = Integer.parseInt(st.nextToken());
		
		
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int id = Integer.parseInt(st.nextToken()); //id 
			int time = Integer.parseInt(st.nextToken()); // 소요 시간
			int pri = Integer.parseInt(st.nextToken()); //중요도
			
			pq.offer(new Process(id, time, pri));
		}
		
		
		
		
		for(int i=0; i<t; i++) {
			if(pq.isEmpty()) { //프로세스가 없는 경우
				break;
			}
			
			Process ps = pq.poll();
			sb.append(ps.id+"\n");
			
			if(ps.time ==1) { //남은 시간이 1초일 경우 큐에 넣을 필요가 없으므로 continue;
				continue;
			}
			
			//현재 선택된 프로세스의 중요도를 감소시켠 다른 프로세스의 중요도를 증가시키는것과 동일한 결과값
			pq.offer(new Process(ps.id, ps.time-1, ps.pri-1));
			
		}//for
		
		System.out.println(sb);
		
	}
}

class Process implements Comparable<Process>{
	int id;
	int time;
	int pri;
	
	Process(int id, int time, int pri){
		this.id = id;
		this.time = time;
		this.pri = pri;
	}
	
	
	@Override
	public int compareTo(Process o) {
		if(this.pri == o.pri) {
			return this.id - o.id;
		}
		return o.pri - this.pri;
	}
}