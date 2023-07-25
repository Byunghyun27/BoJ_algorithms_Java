import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2864_5와6 {
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		st = new StringTokenizer(br.readLine());
		
		String A = st.nextToken();
		String B = st.nextToken();
		String MinA ="";
		String MinB ="";
		String MaxA ="";
		String MaxB ="";
		
		
		for(int i=0; i<A.length(); i++) {
			char ch = A.charAt(i);
			
			if(ch =='6'||ch =='5') {
				MinA+="5";
				MaxA+="6";
			} else {
				MinA +=ch;
				MaxA +=ch;
			}
		}//for_A
		
		for(int i=0; i<B.length(); i++) {
			char ch = B.charAt(i);
			
			if(ch =='6'||ch =='5') {
				MinB+="5";
				MaxB+="6";
			} else {
				MinB +=ch;
				MaxB +=ch;
			}
		}//for_A
		
		int min = Integer.parseInt(MinA) + Integer.parseInt(MinB); 
		int max = Integer.parseInt(MaxA) + Integer.parseInt(MaxB); 
		System.out.println(min + " " + max);
		
		
	}
}