import java.io.*;
import java.util.*;

public class No_1026_보물 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] A = new int[n];
		Integer[] B = new Integer[n];
	
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}	
			
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int j=0; j<n; j++) {
			B[j] = Integer.parseInt(st2.nextToken());
		}
			
		//A의 수 재배열 
		Arrays.sort(A);
		Arrays.sort(B, Collections.reverseOrder());
		
		//S = A[0] × B[0] + ... + A[N-1] × B[N-1]	
		int s = 0;
		int min = A[0];
		
		for(int k=0; k<n;k++) {
			s += A[k] * B[k];
						
			if(min > s) {
				min = s;
			}
			
		}
		
		System.out.println(s);
		
	}

}
