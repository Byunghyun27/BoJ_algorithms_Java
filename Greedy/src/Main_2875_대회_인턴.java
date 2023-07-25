import java.io.*;
import java.util.*;

public class Main_2875_대회_인턴 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //여
		int M = Integer.parseInt(st.nextToken()); //남
		int K = Integer.parseInt(st.nextToken()); //인턴쉽 참가 인원
		
		int cnt = 0;
		
		while(N>=2 && M>=1 && N+M >=3+K) {
			N-=2;
			M--;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}