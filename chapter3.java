import java.util.Arrays;
import java.util.Scanner;

public class chapter3 {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		// System.out.println(a+b);

		// String c = sc.nextLine();
		// int cInt = Integer.parseInt(c);
		// System.out.println(cInt);

		// int i =5, j=0;
		//
		// j = i++;
		// System.out.println("j=i++; 실행 후, i=" +i+ ", j=" +j);
		//
		// i = 5;
		// j = 0;
		// j = ++i;
		// System.out.println(j+""+i);

		// int i = -10;
		// i = +i;
		// System.out.println(i);
		//
		// i = -10;
		// i = -i;
		// System.out.println(i);

		// double d= 85.4;
		// int score = (int) d;
		// System.out.println(score);
		// System.out.println(d);
		// int a = 10;
		// int b = 4;
		//
		// System.out.printf("%d + %d = %d%n",a,b,a+b);
		// System.out.printf("%d / %f = %.2f",a,(float)b,(float)a/b);

		// byte a =10;
		// byte b= 20;
		// byte c = (byte)(a*b);
		// System.out.println(c);

		// double pi = 3.141592;
		// double shortPi = Math.round(pi * 1000) / 1000.0;  //반올림
		// System.out.println(shortPi);

		// int num = 0;
		//
		// for(int i = 1; i <=5; i++){
		// 	num = (int)(Math.random() *2) + 1;//0제거
		// 	System.out.println(num);
		// }

		// int sum = 0;
		// int i = 0;
		// while (sum <= 100){
		// 	System.out.println(sum);
		// 	sum += ++i;
		// }

		// 	int input = 0, answer = 0;
		//
		// 	answer = (int)(Math.random() * 100) + 1;
		// 	Scanner sc = new Scanner(System.in);
		// 	do {   //실행보장!!
		// 		System.out.println("정수 입력");
		// 		input = sc.nextInt();
		//
		// 		if (input > answer) {
		// 			System.out.println("더 작은 수");
		// 		} else if (input < answer) {
		// 			System.out.println("더 큰 수");
		// 		}
		// 	} while (input != answer);
		// 	System.out.println("정답 ");

		// int sum = 0;
		// int i = 0;
		//
		// while (true){
		// 	if(sum > 100)
		// 		break;
		// 	++i;
		// 	sum += i;
		// }
		// System.out.println(i);
		// System.out.println(sum);

		// int menu = 0;
		// int num = 0;
		//
		// Scanner sc = new Scanner(System.in);
		// while (true){
		// 	System.out.println("선택");
		// 	String tmp = sc.nextLine();
		// 	menu = Integer.parseInt(tmp);
		//
		// 	if(menu ==0){
		// 		System.out.println("프로그램 종료");
		// 		break;
		// 	} else if (!(1 <= menu && menu <= 3
		// 	))
		// 		System.out.println("메뉴가 읍다");
		// 	continue;
		// }
		// System.out.println(menu);

		// Loop1: for(int i =2; i <= 9; i++){
		// for(int j=1; j<=9; j++){
		// 	if(j==5)
		// 		// break Loop1;
		// 	    // break;
		// 		// continue Loop1;
		// 		// continue;
		// 	System.out.println(i*j);
		// }
		// 	System.out.println();
		// }

		// int a[];
		// a = new int[5];
		// int[] b = new int[5];

		// int[] score = new int[6];
		// for(int i=0; i < 6; i++)
		// 	System.out.println(score[i]);
		//
		// for(int i=0; i<score.length; i++){
		// 	System.out.println(score[i]);
		// }
		//
		// score[0] = 10;
		// score[1] = 40;
		// score[2] = 50;
		// score[3] = 60;

		// int[] iArr = {100, 95, 80, 70, 60};
		// for(int i = 0; i< iArr.length; i++){
		// 	System.out.println(iArr[i]);
		// }
		// System.out.println(iArr); //이상하게 출력됨
		// System.out.println(Arrays.toString(iArr));
		//
		// char[] chArr = {'a', 'b', 'c', 'd'};
		// System.out.println(chArr);

		// int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		// System.out.println(Arrays.toString(numArr));
		//
		// for(int i =0; i< 100; i++){
		// 	int n = (int)(Math.random() * 10);
		// 	int tmp = numArr[0];
		// 	numArr[0] = numArr[n];
		// 	numArr[n] = tmp;
		// }
		// System.out.println(Arrays.toString(numArr));

		// String[] name = new String[5];
		//
		// String[] names = {"kim", "park", "yi"};
		// for(int i =0; i< names.length; i++){
		// 	System.out.println(names[i]);
		// }
		// String tmp = names[2];
		// System.out.println(tmp);
		// names[0] = "yu";
		// for(int i =0; i< names.length; i++){
		// 	System.out.println(names[i]);
		// }

		// String str = "ABCDE";
		// char ch = str.charAt(3);
		// System.out.println(ch);

		// String str = "01a345";
		// String tmp = str.substring(1,4);
		// System.out.println(tmp);

		int[][] score = new int[4][3];
		int[][] scores = {
			{100, 100, 100},
			{20, 20, 20},
			{30, 30, 30}
		};
	}
}


