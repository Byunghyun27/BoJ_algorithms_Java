import java.io.*;
import java.util.*;

public class Main_15903_카드합체놀이 {

		/*
		1. x번 카드와 y번 카드를 골라 그 두 장에 쓰여진 수를 더한 값을 계산한다. (x ≠ y)
		2. 계산한 값을 x번 카드와 y번 카드 두 장 모두에 덮어 쓴다.
		 */
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		
		int n = Integer.parseInt(st.nextToken()); //카드의 개수
		int m = Integer.parseInt(st.nextToken()); //카드 합체 개수
		
		long [] card = new long[n];
	
		//입력
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		
		
		
		for(int i=0; i<m;i++) {
			Arrays.sort(card);
			long sum = card[0] + card[1];
			card[0] = sum;
			card[1] = sum;
		}
		
		
		long ans =0;
		
		for(int i=0; i<n; i++) {
			ans+=card[i];
		}
		
		
		System.out.println(ans);
		
		
	}
}
