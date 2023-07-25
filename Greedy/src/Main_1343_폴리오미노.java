import java.io.*;
import java.util.*;

public class Main_1343_폴리오미노 {
	/*
	 AAAA, BB를 무한대로 갖고있음
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		String str =br.readLine();
		
		int cnt =0;
		boolean check = true;
		
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch=='X') {
				cnt++;
			} else if(ch =='.') {
				if(cnt%2 !=0) {
					check = false;
					break;
			}
			
				while(cnt>=4) {
					sb.append("AAAA");
					cnt-=4;
				} 
			
				while(cnt>=2) {
					sb.append("BB");
					cnt-=2;
				}
			
				sb.append(".");
			
			}//else if
		}//for
		

		
		while(cnt !=0) {
			if(cnt %2 !=0) {
				check = false;
				break;
			}
			if(cnt>=4) {
				sb.append("AAAA");
				cnt-=4;
			} else if(cnt>=2) {
				sb.append("BB");
				cnt-=2;
			}
		}
		
		
	
		if(check) {
			System.out.println(sb);
		} else {
			System.out.println("-1");
		}
		
	}
}