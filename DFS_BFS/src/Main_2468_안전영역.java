import java.io.*;
import java.util.*;

public class Main_2468_안전영역 {
	
	static int n;
	static int[][] map;
	static boolean[][] ischeck;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int max =0;
	static int ans=0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
	
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, map[i][j]);
			}
		}
		
		//n의 범위 2<=N<=100 
		for(int i=0; i<=max; i++) {
			int cnt = 0;
			ischeck = new boolean[n][n];
			
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					if(!ischeck[j][k] && map[j][k] > i) {
						cnt++;
						dfs(i,j,k);
					}
				}
			}
		
		ans = Math.max(ans, cnt);
			
		}//for_i
		
		System.out.println(ans);
		
		
	}//main

	private static void dfs(int hight, int x, int y) {
		ischeck[x][y] = true;
		
		for(int i=0; i<4; i++){
			int nowx = x + dx[i];
			int nowy = y + dy[i];
			
			if(nowx>=0 && nowy>=0 && nowx<n && nowy<n) {
				if(!ischeck[nowx][nowy] && map[nowx][nowy] > hight) {
					ischeck[nowx][nowy] = true;
					dfs(hight, nowx, nowy);
				}
			}
		}
		
		
		
		
	}
}
