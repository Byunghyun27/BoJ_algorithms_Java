import java.io.*;
import java.util.*;

public class Main_2331_반복수열 {

	static int A,P;
	static int ans =0;
	static ArrayList<Integer> list = new ArrayList<>();
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		String A = st.nextToken();
		P = Integer.parseInt(st.nextToken());
		list.add(Integer.parseInt(A));
			
		dfs(A, P);
		
		
		System.out.println(ans);
	
	}

	private static void dfs (String A, int P) {
		
		int sum =0;	
		
		for(int i=0; i<A.length(); i++) {
			int temp = A.charAt(i) -'0';
		
			sum += Math.pow(temp, P);
		
		}
	
		
		if(list.contains(sum)) {
			ans = list.indexOf(sum); 
		} else {
			list.add(sum);
			dfs(String.valueOf(sum),P);
		}
		
		
		
	}
}
