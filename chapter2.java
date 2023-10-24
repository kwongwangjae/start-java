import java.util.Scanner;

import javax.swing.*;

import com.sun.security.jgss.GSSUtil;

public class chapter2 {
	public static void main(String[] args) {
		// System.out.println("hello world");
		// System.out.println("hello");
		// System.out.print("not ln");
		// System.out.println("world");
		// System.out.println(3 + 5);
		// System.out.println(3*8);
		// int x =5;
		// x =10; //선언은 한번만 변경은 int 삭제
		// // System.out.println(x);
		// int x = 100;
		// double pi = 3.14;
		// char ch = 'a';
		// String str = "abc";
		// System.out.println(x);
		// System.out.println(pi);
		// System.out.println(ch);
		// System.out.println(str);
		// String name = "ja" + "va";
		// String str = name + "8.0";
		// System.out.println(name);
		// System.out.println(str);
		// System.out.println(7 + 7 + "");
		// System.out.println(7 + "" + 7);
		int x = 10, y = 5;
		int tem;
		tem = 10;
		x = y;
		y = tem;
		System.out.println(x);
		System.out.println(y);

		//기본형: 실제 값을 저장(boolean, char, int ...)
		//참조형: 값이 저장되어 있는 주소를 저장
		//printf -> 같은 값이라도 다른 형식으로 출력
		// float f1 = .10f;
		// float f2 = 3.14f;
		// double d1 = 3.14315354;
		// System.out.printf("f1 = %f, %e, %g%n", f1,f1,f1);
		// System.out.printf("f1 = %f, %e, %g", f2,f2,f2);
		// System.out.printf("f1 = %f, %e, %g", d1,d1,d1);
		// System.out.println();
		// //화면으로부터 입력받기
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("두자리의 정수를 입력해주세요 ");
		// String input = scanner.nextLine();
		// int num = Integer.parseInt(input);  //입력받은 문자열을 숫자로 변환
		// System.out.printf("num= %d" , num);
		// int a = scanner.nextInt();
		// System.out.println(a);
		// int b =scanner.nextInt(8); //redix: 진법
		// System.out.println(b);
		short sMin  = -32768, sMax = 32767;
		char cMin = 0, cMax = 65535;
		System.out.println(sMin);
		System.out.println((short)(sMin-1));
		System.out.println(sMax);

		String str = "3";
		String kk = "asq423rfewdsv";
		System.out.println(kk.charAt(10) - '0');//인덱스의 위치 10
		System.out.println(str.charAt(0) - '0');
		System.out.println(Integer.parseInt("124") + 1); //숫자형 string이 아니면 변경이 안됨
		System.out.println("3" + 1);
		System.out.println((char)(3 + '0'));


	}
}
