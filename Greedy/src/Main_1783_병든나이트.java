import java.io.*;
import java.util.*;

public class Main_1783_병든나이트 {
	/*
	1) 2칸 위로, 1칸 오른쪽
	2) 1칸 위로, 2칸 오른쪽
	3) 1칸 아래로, 2칸 오른쪽
	4) 2칸 아래로, 1칸 오른쪽
	 */
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //세로길이
		int m = Integer.parseInt(st.nextToken()); //가로길이
		
		int cnt =0;
				
		
		//n=1이라면 시작지점만 이동가능 cnt =1
		if(n == 1) {
			cnt=1;
		} else if (n==2) { 
			//N이 2일경우 2,3번 규칙으로만 움직일 수 있음
			//4방향 다 움직일 수없어 최댓값은 4
			cnt = Math.min(4, ((m+1)/2));
		} else if(n>=3) {
			if(m>=7) {
				//m=7부터 4방향 다 이동 가능
				//4방향 다 이동한 후 y값이 1 증가하는 1,4번 규칙이동을 반복
				//m-2개의 칸을 갈 수 있음
				cnt = m-2;
			} else {
				cnt = Math.min(4,m);
			}
		}
		
		System.out.println(cnt);
		

	}
}