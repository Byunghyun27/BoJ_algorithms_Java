import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_1049_기타줄 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //기타줄의 개수
		int M = Integer.parseInt(st.nextToken()); //기타줄 브랜드의 개수
		int[] pack = new int[M];
		int[] pie = new int[M];
		
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());		
			pack[i] = Integer.parseInt(st.nextToken());
			pie[i] = Integer.parseInt(st.nextToken());
		}//for
		
		//패키지는 6줄이 한세트
		
		
		Arrays.sort(pack);
		Arrays.sort(pie);
		
		int min =0;
			
		 min = Math.min(((N/6)+1)*pack[0], N*pie[0]);    
	     min = Math.min(min, ((N/6))*pack[0] + (N%6)*pie[0]);
	
		
		System.out.println(min);
	
	
	}
}
