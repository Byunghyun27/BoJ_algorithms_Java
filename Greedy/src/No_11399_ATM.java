import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class No_11399_ATM {
	
	static int time;
	static int[] arr; 
	
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr); 
		
		int sum =0;
		
		for(int i=0; i<n;i++) {
			sum += arr[i];
			time += sum;
		}
		
		
		System.out.println(time);
		
		
	}
}
