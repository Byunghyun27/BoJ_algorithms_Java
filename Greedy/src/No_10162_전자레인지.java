import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class No_10162_전자레인지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		//A : 5분, B : 1분, C : 10초
		
		int t = Integer.parseInt(br.readLine()); //조리시간
		
		int a=0, b=0, c=0;
		
		if(t %10 != 0) {
			System.out.println(-1);
			return;
		}
		
		a= t/300;
		t%=300;
		
		b= t/60;
		t%=60;
		
		c= t/10;
	
		System.out.println(a +" " + b + " "+c);
		
		
	}
}