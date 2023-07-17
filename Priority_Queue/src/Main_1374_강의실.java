import java.io.*;
import java.util.*;

class Time implements Comparable<Time> {

	int id;
	int start;
	int end;
	
	Time (int id, int start, int end){
		this.id = id;
		this.start = start;
		this.end = end;
	}
	
	@Override
	public int compareTo(Time o) {
		if(this.start == o.start) {
			return this.id - o.id;
		}
		return this.start - o.start; //오름차순 정렬
	}
}



public class Main_1374_강의실 {
	
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Time> pq = new PriorityQueue<>(); 
		
		
		//강의 번호, 시작시간, 종료 시간
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int id  = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			pq.offer(new Time(id, start, end));		
		}
		
		int cnt=0; //강의실 사용 개수 카운트
		PriorityQueue<Integer> roomtime = new PriorityQueue<>(); // 강의실의 종료 시간을 관리하기 위한 우선순위 큐
		
		
		while(!pq.isEmpty()) {
			Time ans = pq.poll();
			
			if(roomtime.isEmpty()) {
				cnt++;
				roomtime.offer(ans.end);
			} else {
				//현재 강의시간이 가장 이른 강의실 종료시간보다 늦을 경우
				if (ans.start >= roomtime.peek()) {
					roomtime.poll();
				} else {
					cnt++; //새로운 강의실 할당
				}
				
				roomtime.offer(ans.end);
			}
		}//while
		
		System.out.println(cnt);
		
		
		
	}
}