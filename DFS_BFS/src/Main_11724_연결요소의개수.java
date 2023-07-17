import java.io.*;
import java.util.*;

public class Main_11724_연결요소의개수 {
	
	static boolean isCheck[];//방문 기록 저장
	static ArrayList<Integer>[] list;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
			
		
		int n = Integer.parseInt(st.nextToken()); //노드(정점)의 개수
		int m = Integer.parseInt(st.nextToken()); //에지(간선)의 개수
		
		isCheck = new boolean[n+1];
		list = new ArrayList[n+1];
		
		for(int i=1; i<=n;i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		
		for(int i=0; i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			list[s].add(e);
			list[e].add(s);
		}
		
		
		int cnt =0;
		
		for(int i=1; i<=n;i++) {
			if(!isCheck[i]) {
				cnt++;
				DFS(i);
			}	
		}
		
		
		System.out.println(cnt);
		
	}

	private static void DFS(int v) {
		//현재 노드가 방문 노드일 경우
		if(isCheck[v]) {
			return; //더이상 탐색X
		}
		
		isCheck[v] = true;
		
		//재귀함수
		for(int i : list[v]) {
			if(!isCheck[i]) {
				DFS(i);
			}
		}
	}//DFS
	
	
}
