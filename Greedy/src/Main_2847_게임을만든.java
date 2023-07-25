import java.io.*;
import java.util.*;

public class Main_2847_게임을만든 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		
		
		//입력
		for(int i=0; i<n;i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
			
		
		int cnt =0; //감소시킨 값의 수 
		int last = num[n-1]; 
		
		
		for(int i=n-2; i>=0; i--) {
			if(last<=num[i]) {
				while(last<=num[i]) {
					num[i]--;
					cnt++;
				}
			}
			last = num[i];
		}//for
	
		System.out.println(cnt);	
		
	}
}
