import java.io.*;
import java.util.*;

public class Main_20311 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //시험관의 개수
		int k = Integer.parseInt(st.nextToken()); //색깔의 종류의 수
		
		int[] arr = new int[n];
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<k; i++) {
			pq.add(Integer.parseInt(st.nextToken()));
		}
		
		
		

		
	}
}