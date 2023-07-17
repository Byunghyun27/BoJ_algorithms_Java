import java.io.*;
import java.util.*;

public class Main_2667_단지번호붙이기 {
	
	static int n;
	static int[][] map; //지도
	static boolean[][] isCheck; //방문 여부 판단
	static int cnt; //아파트가 몇개있는지 카운트
	
	//조건 : (아래, 위)연결, (좌, 우)연결
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine()); //n*n사이즈 의 지도 
		
		//지도의 범위 : 5<= N <= 25
		map = new int[n][n];
		isCheck = new boolean[n][n];
		
		
		//입력
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			
			for(int j=0; j<n; j++) {
				//map[i][j] = s.charAt(j) -'0'; 
				map[i][j] = Integer.parseInt(s.substring(j,j+1));
			}	
		}//for_i
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				
				//방문하지 않았고 해당 위치에 아파트가 있다면
				if(!isCheck[i][j] && map[i][j] == 1) {
					cnt = 0;		
					dfs(i, j);
					list.add(cnt); //해당위치 아파트의 개수를 리스트에 저장	
				}
			}
		}
		
		System.out.println(list.size());
		
		Collections.sort(list);

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}//main

	private static void dfs(int x, int y) {
		isCheck[x][y] = true;
		cnt++;
		
		//dfs 반복 할때마다 아파트 개수 증가		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			//다음 위치가 아파트가 존재하면서 방문하지 않은경우 처리
		if(nx >= 0 && ny >= 0 && nx < n && ny < n) {	
			if(!isCheck[nx][ny] && map[nx][ny] == 1) {
				
				dfs(nx, ny);
				}
			}
		}
		
			
		
	}//dfs
}