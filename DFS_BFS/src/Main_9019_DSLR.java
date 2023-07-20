import java.io.*;
import java.util.*;

public class Main_9019_DSLR {

	static int t,A,B;
	static boolean[] isCheck;
	static String[] str;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		t = Integer.parseInt(br.readLine());
		
		
		for(int tc =0; tc<t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			
			isCheck = new boolean[10000];
			str = new String[10000];
			Queue<Integer> q = new LinkedList<>();
			
			Arrays.fill(str, "");
			q.add(A);
			isCheck[A] = true;
			
			System.out.println(bfs(q, str, B, isCheck));
			
		}
	
		
		
		
		
	}
	private static String bfs(Queue<Integer> q, String[] str, int result, boolean[] isCheck) {
		
		while(!q.isEmpty() && !isCheck[result]) {
			int num = q.poll();
			
			if(num == result) return str[num];
			
			int d = (num * 2) % 10000; 
			int s = num == 0 ? 9999 : num-1;
			int L = (num % 1000) *10 + num /1000; // num%1000 = 234 -> * 10 = 2340 -> + num/1000 ->2341
			int R = (num %10) * 1000 + num/10;
			
			
			if(!isCheck[d]) {
				q.add(d);
				isCheck[d] = true;
				str[d] = str[num] + "D";
			}
			
			if(!isCheck[s]) {
				q.add(s);
				isCheck[s] = true;
				str[s] = str[num] + "S";
			}
			
			if(!isCheck[L]) {
				q.add(L);
				isCheck[L] = true;
				str[L] = str[num] + "L";
			}
			
			if(!isCheck[R]) {
				q.add(R);
				isCheck[R] = true;
				str[R] = str[num] + "R";
			}	
		}
	
		
		return str[result];
	}
}
