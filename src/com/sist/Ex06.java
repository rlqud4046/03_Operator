package com.sist;

/*
 * 비트 연산자
 * 	비트(0 or 1)를 이용하여 연산하는 연산자
 * 	&(and) : 두 조건이 모두 참인 경우 1, 그 외에는 0 반환
 * 	|(or)  : 두 조건이 모두 거짓인 경우 0, 그 외에는 1 반환
 * 	^(xor) : 두 조건의 참거짓이 다른경우 1, 같으면 0 반환
 */

public class Ex06 {

	public static void main(String[] args) {

		int num1 = 10, num2 = 5;
		
		int result = num1 & num2; // 10과 5를 2진화 시키면 1010, 0101인데 이 이진수를 각 자리별로 and 연산
		System.out.println("and result ==> " + result); 
		
		result = num1 | num2; // 10과 5를 2진화 시키면 1010, 0101인데 이 이진수를 각 자리별로 or 연산
		System.out.println("or result ==> " + result); 

		num2 = 8;
		result = num1 ^ num2; // 10과 8을 2진화 시키면 1010, 1000인데 이 이진수를 각 자리별로 xor 연산
		System.out.println("xor result ==> " + result); 
		
	}

}
