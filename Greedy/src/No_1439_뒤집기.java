import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No_1439_뒤집기 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		

		int zero = 0;
		int one = 0;
		
		char ch = S.charAt(0);
		
		if(ch =='0') {
			zero++;
		} else {
			one ++;
		}
		
	
		for(int i=1; i<S.length();i++) {
			char c = S.charAt(i);
			if(c == ch) {
				continue;
			} else if(c =='0') {
				zero++;
			} else {
				one++;
			}
			
			ch = c;
			
		}//for
		
		System.out.println(Math.min(zero, one));
		
		
		
	}
}