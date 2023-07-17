import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main_5464_주차장 {
	
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //주차공간
		int m = Integer.parseInt(st.nextToken()); //하루 주차장 이용 차량 
		
		int[] Parking = new int[n+1]; //주차 공간
		int[] Weight = new int[m+1]; //차량 무게
		int[] parkingWeight = new int[n+1];// 주차 공간들의 단위 무게 

		
		for(int i=1; i<=n; i++) {
			parkingWeight[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=1; i<=m;i++) {
			Weight[i] = Integer.parseInt(br.readLine());
		}
		
		
		Queue<Integer> q = new LinkedList<>();
		
		int sum =0;
		
		outer : for(int i=0; i< 2*m; i++) {
			int car = Integer.parseInt(br.readLine());
		
			if(car > 0) {
				for(int j=1; j<n+1; j++) {
					if(Parking[j] == 0) {
						Parking[j] =car;
						continue outer;
					}
				}
				q.offer(car);
			} else { //나가는 차
				for(int j=1; j<n+1; j++) {
					if(Parking[j] ==car*(-1)){
						Parking[j] = 0; //음수일 경우 해당 자리를 0으로 비워줌
						sum += parkingWeight[j] * Weight[car*(-1)];
						if(!q.isEmpty()) Parking[j] = q.poll();
						break;
					}
				}
			}
		}
		
		System.out.println(sum);
	
	}
}