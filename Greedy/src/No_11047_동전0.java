import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class No_11047_동전0 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //동전의 종류
		int k = Integer.parseInt(st.nextToken()); //가지고 있는 동전의 합 
	
		int[] arr = new int[n];
		int cnt =0;
		
		
		for(int i=0; i< n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for(int i= n-1; i>=0; i--) {
			if(k >=arr[i]) {
				cnt+= k/arr[i];
				k %= arr[i];
			}
		}
		

		
		System.out.println(cnt);

	}
}
