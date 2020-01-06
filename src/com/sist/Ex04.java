package com.sist;

/*
 * 단항 연산자 / 이항 연산자 / 삼항 연산자
 * 	연산을 수행하는 항의 개수
 */

public class Ex04 {

	public static void main(String[] args) {

		// 단항 연산자 ++ --

		int su1 = 10, su2 = 10;
		System.out.println(++su1); // 값을 증가 후 출력 >>> 전위 연산자, 변수명 앞
		System.out.println(su2++); // 출력 후 값을 증가 >>> 후위 연산자, 변수명 뒤
		System.out.println(su2);
		System.out.println();

		int num1 = 10, num2 = 20;
		System.out.println(++num1 + num2++); //11+20c
		System.out.println((++num1 % 3) + (num1 * ++num2)); //12%3 + 12*22 264
		
		/* 삼항 연산자 
		 * 	형식)
		 * 		(조건) ? 수식1 : 수식2;
		 * 			수식 1 : 해당 조건이 참인 경우 실행
		 * 			수식 2 : 해당 조건이 거짓인 경우 실행
		 * 	간단한 조건문 대신 사용할 수 있는 연산자
		 */
		
		int num3 = 10, num4 = 20;
		int result = (num3 > num4) ? num3 : num4;
		
		System.out.println("큰 값은 " + result);
		
		//	데이터베이스와 연결
		// 	키보드로 데이터를 입력을 받자
		
		String id = args[0];
		String pw = args[1];
		
		//equals() : 문자열이 같은지 틀린지를 비교하는 메서드, 결과값은 boolean으로 반한됨
		String login = (id.equals("hong")) && (pw.equals("1234")) ? "로그인 성공" : "로그인 실패";
		//  저장 위치                               		조	건	문						수식1			수식2
		
		System.out.println(login);
		
		

	}

}
