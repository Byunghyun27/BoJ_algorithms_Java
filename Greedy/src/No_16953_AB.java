import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_16953_AB {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		/*
		 - 2를 곱한다.
		 - 1을 수의 가장 오른쪽에 추가한다. 	
		 */
		
		int cnt = 1;
		
		//A를 B로 바꾸는 로직
		while(B != A) {
		
			if(B<A) {
				cnt = -1;
				break;
			}
			
			if(B % 2 ==0) {
				B/=2;
			} else if(B%10 == 1) {
				B/=10;
			} else {
				cnt =-1;
				break;
			}
			
			cnt++;			
			
		}//while
			
		System.out.println(cnt);
	}
}
