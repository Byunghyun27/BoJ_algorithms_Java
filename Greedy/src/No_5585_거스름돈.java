import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class No_5585_거스름돈 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int price = 1000 - Integer.parseInt(br.readLine());
		int[] money = {500,100,50,10,5,1};
		
		int cnt =0; //잔돈 
		
		
		for(int coin : money) {
			if(price >= coin) {
				cnt += price / coin;
				price %=coin;
			}
		}
		
		
		System.out.println(cnt);
		
		
	}
}
