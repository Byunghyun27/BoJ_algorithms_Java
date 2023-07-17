import java.io.*;
import java.util.*;

public class Main_1260_DFS와BFS {
	
	static ArrayList<Integer>[] A;
	static boolean[] isCheck; 
	static int n,m,num;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken()); //노드의 개수
		m = Integer.parseInt(st.nextToken()); //에지
		num = Integer.parseInt(st.nextToken()); //탐색 시작 번호
		
		A = new ArrayList[n+1];
		isCheck = new boolean[n+1];
		
		for(int i=1; i<=n; i++) {
			A[i] = new ArrayList<>();
		}
		
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
		
			A[s].add(e);
			A[e].add(s);
		}
		
		for(int i=1; i<=n;i++) {
			Collections.sort(A[i]);
		}
		
		DFS(num);
		
		isCheck = new boolean[n+1];
		System.out.println();
		BFS(num);
		
		
	}

	private static void DFS(int number) {
		System.out.print(number + " ");
		isCheck[number] = true;
		
		for(int i : A[number]){
			if(!isCheck[i]) DFS(i);
		}
	}//DFS
	
	
	private static void BFS(int number) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(number);
		isCheck[number] = true;
		
		while(!Q.isEmpty()) {
			int now = Q.poll();
			System.out.print(now + " ");
			
			for(int i : A[now]) {
				if(!isCheck[i]) {
					isCheck[i] = true;
					Q.add(i);
				}
			}
			
		}
		
		
	}
}
