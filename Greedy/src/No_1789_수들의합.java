import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No_1789_수들의합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long s = Long.parseLong(br.readLine());
		long i=0;
		long sum =0;
		long cnt =0;
		
		//서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?
		while(true) {
			sum += ++i;
			
			
			if(sum>s) {
				System.out.println(cnt);
				break;
			}
		
			cnt++;
	
		}	//while
		
		
	}
}