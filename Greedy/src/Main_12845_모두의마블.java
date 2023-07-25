import java.io.*;
import java.util.*;

public class Main_12845_모두의마블 {
	/*
	 카드 A에 카드 B를 덧붙일 수 있다. 이때 붙이는 조건은 다음과 같다.
	 1. 두 카드는 인접한 카드여야 한다.
     2. 업그레이드 된 카드 A의 레벨은 변하지 않는다.
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		Integer[] card = new Integer[n];
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
	
		Arrays.sort(card, Comparator.reverseOrder());
		
		int gold = 0;
		int num = card[0];
		
		for(int i=1; i<n;i++) {
			int x =Math.max(num,card[i]); //level
			gold += num + card[i];			
			num = x;
		
		}
		
		System.out.println(gold);
		
		
	}
}