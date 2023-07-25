import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Note {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = 1234;
		
		System.out.println((n%1000) * 10 +  +n/1000);
		System.out.println((n%10)*1000 + n/10);
		
		
		
	}

}
