import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class No_1931_회의실배정 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		/*
		  time[][0] 은 시작시점을 의미 
		  time[][1] 은 종료시점을 의미 
		*/
		int[][] time = new int[n][2];
		
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			time[i][0] = Integer.parseInt(st.nextToken()); //시작 시간
			time[i][1] = Integer.parseInt(st.nextToken()); //종료 시간
		}
		
		
		Arrays.sort(time,(a,b) -> {
			/* 예시에서 [2,5]와 [3,5]의 종료 시간이 같으므로 if실행
			 time = [[1, 4],[2, 5],[3, 5],[0, 6]] 있을때 a[1] ==b[1]에 따라 정렬시키면 
			 time = [[1, 4],[2, 5],[3, 5],[0, 6]] 2가 3보다 작으므로 [2,5]를 먼저 정렬
			 */
			
			if(a[1] == b[1]) { //종료시간이 같을 경우 시작이 빠른 순 
				return a[0] - b[0];
			}
			//시작과 종료시점이 같지 않을경우 
			return a[1]-b[1];
		});
		
		
		int cnt = 0;
		int end = 0;
		
		
		for(int i=0; i<n; i++) {
			if(end <= time[i][0]) {
				end = time[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}