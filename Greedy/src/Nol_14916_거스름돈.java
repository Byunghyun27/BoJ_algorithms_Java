import java.io.*;
import java.util.*;

public class Nol_14916_거스름돈 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //거스름돈 액수
		
		//최소 개수 출력, 거슬러 줄 수 없으면 -1
		//가지고있는 동전은 2원 5원 뿐
		
		int coin =0;
		
		while(n > 0) {
			if(n % 5==0) {
				coin += n/5;
				break;
			} else {
				n-=2;
				coin++;
			}
			
			if(n<0) {
				coin = -1;
				break;
			}
		}

		
		System.out.println(coin);
		
		
	}
}