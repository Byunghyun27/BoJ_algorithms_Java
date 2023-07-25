import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_1744_수묶기 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		
		//입력
		int minusCount=0;
		for(int i=0; i<n; i++) {
			num[i] = Integer.parseInt(br.readLine());
			if(num[i] <= 0) {
				minusCount ++;
			}
		}
		
		
		Arrays.sort(num);
		
		
		int ans = 0; //최종 값 저장
		
		//음수 부분(0 포함) 두 개씩  묶어서 더하기
		for(int i=1; i<minusCount; i+=2) {
			ans += (num[i-1] * num[i]);
		}
		
		//음수(0포함)가 홀수 개일 경우 그냥 더하기
		if(minusCount % 2 ==1) {
			ans += num[minusCount-1];
		}
		
		//양수가 홀수일 경우 더하기
		if((n-minusCount) %2 ==1) {
			ans+=num[minusCount];
		}
		
		for(int i=n-1; i > minusCount;i-=2) {
			int mul = num[i] * num[i-1];
			int sum = num[i] + num[i-1];
			
			if(mul > sum) {
				ans+=mul;
			} else {
				ans+=sum;
			}
		}
		
		System.out.println(ans);
		
		
		
	}
}