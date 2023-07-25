import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_13305_주유소 {
	
	static long[] km;
	static long[] price;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//도시의 개수
		int n = Integer.parseInt(br.readLine());
		km = new long[n-1];
		price = new long[n];
		
		
		//도로의 길이 
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n-1; i++) {
			km[i] = Integer.parseInt(st.nextToken());
		}
		
		
		//리터당 가격
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		long sum =0;
		long money = price[0];
		
	
		for(int i=0; i<km.length; i++) {
			if(price[i] < money ) {
				money = price[i];
			}
			
			sum += (money * km[i]);
			
		}
		
		System.out.println(sum);
		
	}//main
}
