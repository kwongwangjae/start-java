import java.util.Scanner;

public class Main {

	// public boolean solution(String s){
	// 	int start = 0;
	// 	int end = s.length() - 1;
	// 	//서로 중앙으로 이동해 나가다 곂치는 지점에 도달하면 종료
	// 	while (start < end){
	// 		//영숫자인지 판별하고 유효하지 않으면 한 칸 씩 이동
	// 		if(!Character.isLetterOrDigit(s.charAt(start))){
	// 			start++;
	// 		} else if (!Character.isLetterOrDigit(s.charAt(end))) {
	// 			end--;
	// 		} else{ // 유효한 문자라면 앞 글자와 뒷글자를 모두 소문자로 변경해서 비교
	// 			if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
	// 				return false;
	// 			}
	// 			start++;
	// 			end--;
	// 		}
	// 	}
	// 	//무사히 실행되면 true 반환
	// 	return true;
	//
	// }

	// 이코드의 특징은 굉장히 정석적임 그럴 수 밖에 없는게 전체 다 돌지 않고도 처리를 할 수 있음

	public boolean solution(String s){
		String s_filter = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		String s_reversed = new StringBuilder(s_filter).reverse().toString();

		return s_filter.equals(s_reversed);

	}
	//
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.print(T.solution(s));
	}
}



