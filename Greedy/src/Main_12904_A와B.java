import java.io.*;
import java.util.*;

public class Main_12904_A와B {
	
	/*
	 1. 문자열의 뒤에 A를 추가한다.
	 2. 문자열을 뒤집고 뒤에 B를 추가한다.
	 */
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		StringBuilder s = new StringBuilder(br.readLine());
		StringBuilder t = new StringBuilder(br.readLine());
			
		
		while(s.length() < t.length()) {
			if(t.charAt(t.length()-1)=='A') {
				t.deleteCharAt(t.length()-1);
			
			} else if(t.charAt(t.length()-1)=='B') {
				t.deleteCharAt(t.length()-1);
				t.reverse();
			}
		}//while	
			
		  System.out.println(t.toString().equals(s.toString()) ? 1 : 0);
		
		
	}
}