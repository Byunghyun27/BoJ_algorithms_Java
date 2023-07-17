import java.io.*;
import java.util.*;

public class Main_10451_순열사이클{
	
	static boolean[] ischeck;
	static ArrayList<Integer>[] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		int t = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			ischeck = new boolean[n+1];
			arr =  new ArrayList[n+1];		
			
			for(int j=1; j<=n;j++) {
				arr[j] = new ArrayList<Integer>();
			}
			
			
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n;j++) {
				arr[j].add(Integer.parseInt(st.nextToken()));
			}//for_j
			
			int cnt=0;
			
			for(int k=1; k<=n; k++) {
				if(!ischeck[k]) {
					dfs(k);
					cnt++;
				}
			}
			
			System.out.println(cnt);
			
		}//for_i
	}

	private static void dfs(int start) {
		if(ischeck[start]) return;	
		
		
		ischeck[start] = true;
		
		for(int i : arr[start]) {
			if(!ischeck[i]) {
				dfs(i);
			}
		}
		
		
	}//dfs
}
