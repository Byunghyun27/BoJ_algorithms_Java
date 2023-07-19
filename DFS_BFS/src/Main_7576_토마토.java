import java.io.*;
import java.util.*;

public class Main_7576_토마토 {

	static int n,m;
	static int[][] map;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static Queue<int[]> Q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken()); //가로
		n = Integer.parseInt(st.nextToken()); //세로
		map = new int[n][m];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] ==1) {
					Q.add(new int[] {i, j, 1});
				}
			}
		}
		
		int result= bfs();
		
		if(isCheck()) {
			result =-1;
		}
		
		System.out.println(result);
	}


	private static int bfs() {
		int day=0;
		
		while(!Q.isEmpty()) {
			int now[] = Q.poll();
			int x = now[0];
			int y = now[1];
			day = now[2]; //현재 일수 
			
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (map[nx][ny] == 0) {
                        map[nx][ny] = 1;
                        Q.add(new int[]{nx, ny, day+1});
                    }
                }
				
			}
		}//while
		
		return day -1;
	}
	
	

	private static boolean isCheck() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}

	
}