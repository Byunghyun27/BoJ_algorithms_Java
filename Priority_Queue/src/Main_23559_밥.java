import java.io.*;
import java.util.*;

public class Main_23559_밥 {

	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //학식을 먹어야하는 일의 수
		int x = Integer.parseInt(st.nextToken()); //학식에 써야할 돈
		
		
		int[][] menu = new int[n][2];
		
		
	
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			menu[i][0] = Integer.parseInt(st.nextToken());
			menu[i][1] = Integer.parseInt(st.nextToken());
		}
		
			
		Arrays.sort(menu, (o1,o2) ->{
			return (o2[0] - o2[1]) - (o1[0] - o1[1]);
		});
		
		
		int ans = 0;
		int na =0;
		
		
		while(x - ((n-na) *1000) >= 4000) {
			if(menu[na][0] < menu[na][1]) break;
			
			ans+=menu[na][0];
			x -=5000;
			na++;
		}
		
		
		while(n > na) {
			ans+=menu[na][1];
			na++;
		}
		
		
		
		System.out.println(ans);
		
		
		
		
	}
}