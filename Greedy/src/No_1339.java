import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_1339{
	
	static int[] arr = new int[26];//알파뱃 개수

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N= Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			int pow = (int) Math.pow(10, str.length() -1);
			
			for(int j=0; j<str.length();j++) {
				int index = str.charAt(j) - 'A'; //알파뱃에 해당하는 값
				
				arr[index] += pow;
				pow /= 10;
			} //for_j
		}	
		
		Arrays.sort(arr);
		
		int sum = 0;
		int num =9;
		
		for(int i= arr.length-1; i>=0; i--) {
			if(arr[i] ==0) break;
			
			sum +=arr[i] *num;
			num --;
		}
		
		System.out.println(sum);

	} 
}
