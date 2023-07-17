import java.io.*;
import java.util.*;

public class Main_2178_미로탐색 {
	
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static boolean[][] isCheck;
	static int[][] A;
	static int n,m;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		A = new int[n][m];
		isCheck = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for(int j=0; j<m;j++) {
				A[i][j] = Integer.parseInt(line.substring(j, j+1));
			}
		}
		
		BFS(0,0);
		System.out.println(A[n-1][m-1]);
		
		
	}

	private static void BFS(int i, int j) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {i, j});
		
		isCheck[i][j] = true;
		
		while(!q.isEmpty()) {
			int now[] = q.poll();

			//상하좌우 탐색
			for(int k=0; k<4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				
				if(x >=0 && y>=0 && x<n && y<m) { //배열을 넘어가면 안되고 
					if(A[x][y]!=0 && !isCheck[x][y]) { //0이어서 갈 수 없구나 이미 방문한 곳이면 안됨
						isCheck[x][y] = true;
						A[x][y] = A[now[0]][now[1]] + 1;//핵심 부분
						q.add(new int[] {x,y});
					}
				}
			}
			
			
		}
		
	}

}
