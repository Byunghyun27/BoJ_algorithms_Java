import java.io.*;
import java.util.*;

public class Main_10971_외판원순회2{

	static int n;
	static boolean[] ischeck;
	static int[][] map;
	static int ans =Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		ischeck = new boolean[n];
		
		//입력
		for(int i=0; i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		for(int i=0; i<n; i++) {
			ischeck[i] = true;
			dfs(i,i,0,0);
		}
		
		System.out.println(ans);
		
		
	}

	private static void dfs (int start, int now, int depth, int sum) {
		if(depth == n-1) {
			if(map[now][start] !=0) {
				sum += map[now][start];
				ans = Math.min(ans, sum);
			}
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(!ischeck[i] && map[now][i] > 0) {
				ischeck[i] = true;
				dfs(start, i, depth+1, sum + map[now][i]);
				ischeck[i] = false;
			}
		}
		
	}
}