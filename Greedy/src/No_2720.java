import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No_2720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());

		
		//쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수를 구하는 프로그램을 작성
		//손님이 받는 동전의 개수를 최소 개수로
		
		for(int TC=0; TC<T; TC++) {
			
			int C = Integer.parseInt(br.readLine());
			int[] cnt = {0, 0, 0, 0};
			
            cnt[0] = C / 25; // 쿼터 개수 계산
            C %= 25; // 나머지 계산

            cnt[1] = C / 10; // 다임 개수 계산
            C %= 10; // 나머지 계산

            cnt[2] = C / 5; // 니켈 개수 계산
            C %= 5; // 나머지 계산

            cnt[3] = C; // 페니 개수 계산

            System.out.println(cnt[0] + " " + cnt[1] + " " + cnt[2] + " " + cnt[3]);
			
		}//for
		
		
		
	}//main
}
