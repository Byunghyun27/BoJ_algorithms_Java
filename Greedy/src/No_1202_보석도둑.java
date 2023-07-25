import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.PriorityQueue;

public class No_1202_보석도둑 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		

		int N = Integer.parseInt(st.nextToken()); //보석의 개수
		int K = Integer.parseInt(st.nextToken()); //가방의 개수
		
		
		PriorityQueue<int[]> pq = new PriorityQueue<>((e1, e2) -> {return e2[1] - e1[1];});
		
		
		int[][] jewels = new int[N][2]; //보석의 개수 N개
		int[] bag = new int[K];
		
		
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			jewels[i][0] = Integer.parseInt(st.nextToken());
			jewels[i][1] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=0; i<K; i++) {
			bag[i] = Integer.parseInt(br.readLine());
		}
		

		Arrays.sort(jewels, (e1, e2) -> {
			return e1[0] - e2[0];
		});
		
		Arrays.sort(bag);
		
		
		int index = 0;
		long answer = 0;
		
		
		for(int i=0; i<K; i++) {
			int newbag = bag[i];
			
			while(index < N) {
				if(jewels[index][0] <= newbag) {
					pq.add(jewels[index].clone()); //.clone() : 객체의 복사본을 생성하는 메소드 (배열 복사를 위하여 독립적인 복사본을 만듬)
					index++;
				} else {
					break;
				}
			}//while
			
			if(!pq.isEmpty()) {
				answer += pq.poll()[1];
			}
		}//for
		
		
		System.out.println(answer);
		
		
	}//main 
}
