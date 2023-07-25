import java.io.*;
import java.util.*;

public class Main_13458_시험감독 {
	/*
	 한 시험장에는 총감독관은 1명, 부감독은 무제한
	 
	 */

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] peo = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			peo[i] = Integer.parseInt(st.nextToken()); //응시자의 수	
		}
		
			
		st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken()); //총감독관은 시험장에서 감시할 수 있는 응시자의 수 
		int c = Integer.parseInt(st.nextToken()); //부감독관은 한 시험장에서 감시할 수 있는 응시자의 수
		
		//시험장마다 총감독관 1명씩은 반드시 들어가야 하니 시작 감독관의 수는 시험장의 수로 시작 
		long ans = n; //들어갈 감독관의 수
		
		//감독관 계산
		for(int i=0; i<n; i++) {
			//시험관안에 사람이 총감독관이 확인할 수 있는 인원보다 작거나 같다면 다음반복 실행
			peo[i] -=b;
			
			//총 감독관 한명이서 인원 커버가 가능할 경우
			if(peo[i] <=0) continue;
			
			ans += peo[i]/c;
			
			if(peo[i] %c != 0) {
				ans++;
			}	
		}
		
		System.out.println(ans);
		
	}
}