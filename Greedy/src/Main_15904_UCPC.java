import java.io.*;
import java.util.*;
public class Main_15904_UCPC {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] ucpc = {'U', 'C', 'P', 'C'};
		String str = br.readLine();

		int index =0; //UCPC가 포함되는지 확인하는 index
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) == ucpc[index]) {
				index++;
			}
			
			if(index ==4) {
				break;
			}
		}
		
		if(index ==4) {
			System.out.println("I love UCPC");
		} else {
			System.out.println("I hate UCPC");
		}

		
		
	}
}