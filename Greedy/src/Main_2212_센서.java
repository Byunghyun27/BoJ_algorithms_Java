import java.io.*;
import java.util.*;

public class Main_2212_센서 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //센서의 개수
		int k = Integer.parseInt(br.readLine()); //집중국의 개수
		
		int[] sensor = new int[n];
		
		
		//센서 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			sensor[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sensor);
		

		int[] dif = new int[n-1];
		
		for(int i=0; i<n-1; i++) {
			dif[i] = sensor[i+1] - sensor[i];
		}
		/*
		 6
		 2
		 1 6 9 3 6 7입력값
		 
		 1. 오름차순 정렬 : {1,3,6,6,7,9} 이때 sensor[i+1] - sensor[i]
		 2. 정렬시킨 이후 dif = {0,1,2,2,3}
		 3. n=6, k=2일때 4개의 센서에 의해 커버를 처야하는 상황 
		 4. 0+1+2+2=5, 이 부분은 {1,3}, {6,9} 경로를 커버한 것 
		 */
		
		Arrays.sort(dif);
		
		int ans = 0;
		
		for(int i=0; i<n-k; i++) {
			ans +=dif[i];
		}
		
		
		System.out.println(ans);
		
	}
}