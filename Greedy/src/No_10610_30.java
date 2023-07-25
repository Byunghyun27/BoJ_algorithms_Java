import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_10610_30 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int sum =0;
		
		int[] arr = new int[str.length()];
		
		for(int i=0; i<str.length();i++) {
			arr[i] = str.charAt(i)-48;
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		if(sum % 3 ==0 && arr[0] ==0) {
			for(int i= str.length()-1; i>=0; i--) {
				System.out.print(arr[i]);
			}
		
		} else {
			System.out.println("-1");
		}
		
		
		
		
		
		
	}

}
