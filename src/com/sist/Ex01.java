package com.sist;

/*
 * 자바에서의 연산자의 종류
 * 	산술 연산자	
 * 	관계 연산자
 * 	논리 연산자
 * 	단항 연산자 / 3항 연산자
 *  배정 연산자 / 단축배정 연산자
 *  비트 연산자
 *  쉬프트 연산자
 */

/*
 * 1. 산술 연산자
 * 		덧셈(+), 뺄셈(-), 곱셈(*), 나눗셈(/), 나머지(%)
 */

public class Ex01 {

	public static void main(String[] args) {

		int su1 = 10, su2 = 3, result = 0;

		result = su1 + su2;
		System.out.println("덧셈결과 : " + result);
		result = su1 - su2;
		System.out.println("뺄셈결과 : " + result);
		result = su1 * su2;
		System.out.println("곱셈결과 : " + result);
		result = su1 / su2;
		System.out.println("나눗셈몫 : " + result);
		result = su1 % su2;
		System.out.println("나머지 : " + result);

		/*
		 * 나머지(%) 연산자 : 나머지를 구하는 연산자 홀짝 판별, 어떠한 수의 배수인지 판별
		 */

	}

}
