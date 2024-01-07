import java.util.Scanner;

public class Main {

	public int solution(String n){
		int answer = 1;
		n = n.toLowerCase();
		StringBuilder sn = new StringBuilder(n);
		sn.reverse();
		for(int i = 0; i < n.length(); i++){
			if(n.charAt(i) != sn.charAt(i)){
				answer = 0;
			}
		}

		return answer;
		
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String n = kb.next();
		System.out.print(T.solution(n));
	}
}


//생각한 팰린드롬



