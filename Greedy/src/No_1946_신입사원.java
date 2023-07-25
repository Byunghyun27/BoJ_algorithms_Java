import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1946_신입사원 {
	static int[] score;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int tc=0; tc<t; tc++) {
			
			int n = Integer.parseInt(br.readLine());
			score = new int[n+1]; //시험 성적
			
			for(int i=0; i<n;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				int rank = Integer.parseInt(st.nextToken());
				score[rank] = Integer.parseInt(st.nextToken());
			
			}//for_i

			int cnt = 1; //기준이 되는 처음은 정하고 시작하니 cnt는 1로 시작
			int min = score[1]; //기준이 되는 사람은 1위인 사람으로 index 1의 위치에 있는 값이 최소값 시작
			
			for(int i=2; i<=n; i++) { //첫번째 사람은 정해져있으니 index 2인 사람부터 시작 
				if(score[i] < min) { //더 작은 값을 찾는다면 cnt ++ 
					cnt ++;
					min = score[i];
				}
			}
			
			System.out.println(cnt);		
			
		}//for_tc
	
	}
}