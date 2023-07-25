import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class No_1449_수리공항승 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //물이 새는 곳의 개수
		int L = Integer.parseInt(st.nextToken()); //테이프의 길이
		
		int[] position = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			position[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(position);
		
		int temp =0; //사용한 테이프의 개수
		int result =0;
		
		for(int i=0; i<n; i++) {
			if(position[i] > temp) {
				result ++;
				temp = position[i];
				// 파이프 시작이 1이고 테이프길이가 2일 경우 
                // 1 + 2 = 3 <- 테이프는 1부터2까지 막을 수 있으므로 
                // 1을 빼준다. 
                temp += L - 1;
			}
		}
		System.out.println(result);
		
	}//main
}
