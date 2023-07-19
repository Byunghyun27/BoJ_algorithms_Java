import java.io.*;
import java.util.*;

public class Main_1600_말이되고픈원숭이 {

	static int k, w, h;
	static int[][] map;
	static boolean[][][] ischeck;	
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};	
	static int[] hx = {1, 2, 2, 1, -1, -2, -2, -1};
	static int[] hy = {2, 1, -1, -2, -2, -1, 1, 2};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		k = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		w = Integer.parseInt(st.nextToken()); //가로길이
		h = Integer.parseInt(st.nextToken()); //세로길이
		
		map = new int[h][w];
		
		for(int i=0; i<h; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<w; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(bfs(0,0));
			
	}
	
	
	
	private static int bfs(int x, int y) {
		Queue<int[]> Q = new LinkedList<>();
		ischeck = new boolean[h][w][k+1];
		
		ischeck[y][x][0] = true;
		Q.add(new int[] {x,y,0,0});
		
		while(!Q.isEmpty()) {
			int now[] = Q.poll();
			int px = now[0];
			int py = now[1];
			int chance = now[2];
			int move = now[3];
			
			//도착지점 리턴
			if(px == w-1 && py == h-1) {
				return move;
			}
			
			//기본이동 방식 : 원숭이 이동으로 인접한 방향 하나 이동
			for(int i=0; i<4; i++) {
				int nx = px + dx[i];
				int ny = py + dy[i];
				
				if(nx>=0 && ny>=0 && nx<w &&ny<h) {
					if(!ischeck[ny][nx][chance] && map[ny][nx] != 1) {
						ischeck[ny][nx][chance] = true;
						Q.add(new int[] {nx, ny, chance, move+1}); //move : 이동횟수
					}
				}
			}//for
			
			
			//찬스가 남아있을 경우 말의 방식으로 8가지 방향을 탐색
			if(chance < k) {
				for(int i=0; i<8; i++) {
					int nx = px + hx[i];
					int ny = py + hy[i];
					
					if(nx>=0 && ny>=0 && nx<w &&ny<h) {
						if(!ischeck[ny][nx][chance+1] && map[ny][nx] != 1) {
							ischeck[ny][nx][chance+1] = true;
							Q.add(new int[] {nx, ny, chance+1, move+1}); //move : 이동횟수
						}
					}
					
				}
			}
		}//while
		
		return -1;
		
	}
}