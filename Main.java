import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public String solution(String str){
		String answer = "";
		char[] s = str.toCharArray();
		int lt = 0, rt = s.length-1;
		while (lt < rt){
			char tmp = s[lt];
			if(!Character.isAlphabetic(s[lt]))lt++;
			else if (!Character.isAlphabetic(s[rt]))rt--;
			else {
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		String tmp = String.valueOf(s);
		answer = tmp;


		return  answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
		}

}




