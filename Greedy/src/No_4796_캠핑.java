import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_4796_캠핑 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//V : 휴가 시작, L : 사용가능한 일, P : 연속하는 날짜
		int i=0;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			i++;
			
			int L = Integer.parseInt(st.nextToken()); //사용가능한 캠핑장 일수
			int P = Integer.parseInt(st.nextToken()); //연속하는 일
			int V = Integer.parseInt(st.nextToken()); //휴가 사용
		
			if(L==0 && P ==0 && V==0) break;
			
			int result = (V/P) * L + Math.min((V%P), L);
			System.out.println((V/P));

			System.out.println("Case " + i + ": "+ result);

		
		}//while
	
		
	}
}
