import java.io.*;
import java.util.*;

public class Main_2606_바이러스 {
	
	static int n,m;
	static boolean[] isCheck;
	static ArrayList<Integer>[] list;
	static int cnt =0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		n = Integer.parseInt(br.readLine());//컴퓨터의 수 
		m = Integer.parseInt(br.readLine()); //연결된 컴퓨터의 수 
		
		isCheck = new boolean[n+1];
		list = new ArrayList[n+1];
		
		
		for(int i=1; i<=n; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		
		for(int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			list[s].add(e);
			list[e].add(s);
		}
		
	
		
		dfs(1);
		
	
		System.out.println(cnt);
	
	}

	private static void dfs(int index) {
		if(isCheck[index]) {
			return;
		}
		
		isCheck[index] = true;
		
		for(int i : list[index]) {
			if(!isCheck[i]) {
				cnt++;
				dfs(i);
			}
		}
		
	}
}
