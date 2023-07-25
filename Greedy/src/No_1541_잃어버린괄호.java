import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1541_잃어버린괄호 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//ex) input : 55 - 50+40일때 "55" "50+40" 으로 나뉨
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		
		int sum = Integer.MAX_VALUE;
	
		
		//st에 토큰이 있을 경우 계속 실행
		while(st.hasMoreTokens()) { //hasMoreTokens() : StringTokenizer 객체에 더 이상 사용 가능한 토큰이 있는지 여부를 확인
			int temp = 0;
			
			//"50 + 40" 부분을 "50", "40" 으로 나눔 
			StringTokenizer add = new StringTokenizer(st.nextToken(), "+");
			
			
			while (add.hasMoreTokens()){
				//처음 저장된 55를 가져와 temp 변수에 더함 
				temp += Integer.parseInt(add.nextToken()); //"50", "40" = 90 저장
			}
			
			if(sum == Integer.MAX_VALUE) {
				//첫번째 값인 경우 temp가 첫 수가 됨(sum=0)
				sum = temp; //sum = 55
			} else {
				//두 번째 토큰부터는 sum = temp를 뺌 
				sum-=temp; //55 - 90 = -35
				
			}
		}//in 
		
		
		System.out.println(sum);
		
		
		
	}
}
